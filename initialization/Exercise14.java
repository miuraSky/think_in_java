
public class Exercise14 {
    
    static String FIELD = "field";

    static String MET;

    static {
        MET = "met static";
    }
    
    public static void main(String[] args) {
        System.out.println(Exercise14.FIELD);
        System.out.println(Exercise14.MET);
    }
}
