
public class Exercise6 {
    
    static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String s = "b3w4tyui";

        if (args == null) {
            System.out.println("args is null");
            return ;
        }

        if (args.length == 0) {
            System.out.println("args length is 0");
            return ;
        }

        System.out.println(args[0]);
        System.out.println(storage(args[0]));
    }
}
