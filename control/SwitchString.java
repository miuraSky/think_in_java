
public class SwitchString {
    
    public static void main(String[] args) {
        String s = "def";

        if (args.length > 0) {
            s = args[0];
        }

        switch (s) {
            case "main":
                System.out.println("main");
                break;
            case "sub":
                System.out.println("sub");
                break;
            case "def":
                System.out.println("def");
                break;
            default:
                System.out.println(s);
        }
    }
}
