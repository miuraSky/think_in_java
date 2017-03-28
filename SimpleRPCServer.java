import java.net.Socket;
import java.net.ServerSocket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;

public class SimpleRPCServer {
    
    public static void main(String[] args) throws Throwable {
        serviceStart(new SimpleRPCServiceImpl());        
    }

    public static void serviceStart(SimpleRPCService service) throws Throwable {
        ServerSocket server = new ServerSocket(9527);
        
        while(true) {
            final Socket socket = server.accept();

            new Thread(new Runnable() {
                
                @Override
                public void run() {
                    System.out.println(socket + ", hashCode = " + socket.hashCode());
                    
                    try {
                        ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
                        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());

                        String methodName = is.readUTF();
                        Class<?>[] parameterTypes = (Class<?>[])is.readObject(); 
                        Object[] arguments = (Object[])is.readObject();
                        Method method = service.getClass().getMethod(methodName, parameterTypes);
                        Object result = method.invoke(service, arguments);

                        os.writeObject(result);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
