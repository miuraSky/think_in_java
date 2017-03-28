
public class Exercise14 {
    
    public static void main(String[] args) {
        if (args.length > 1) {
            String args1 = args[0];
            String args2 = args[1];

            System.out.println(args1 + " == " + args2 + ": " + (args1 == args2));
            System.out.println(args1 + " != " + args2 + ": " + (args1 != args2));
            System.out.println(args1 + ".equals(" + args2 + "): " + args1.equals(args2));
            System.out.println("!" + args1 + ".equals(" + args2 + "): " + !args1.equals(args2));
        }
    }
}
