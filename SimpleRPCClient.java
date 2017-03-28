import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class SimpleRPCClient {
    
    public static void main(String[] args) {
        SimpleRPCService service = getProxy(SimpleRPCService.class, "localhost", 9527);
        System.out.println(service.sayHello("Hi, simple"));
    }

    public static <T> T getProxy(Class<T> iClass, String host, int port) {
        return (T)Proxy.newProxyInstance(iClass.getClassLoader(), new Class<?>[] { iClass }, 
                                    new InvocationHandler() {

                                        @Override
                                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                                            Socket socket = new Socket(host, port);
                                            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
                                            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());

                                            os.writeUTF(method.getName());
                                            os.writeObject(method.getParameterTypes());
                                            os.writeObject(args);

                                            return is.readObject();
                                        }

                                    });
    }
}
