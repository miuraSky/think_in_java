
public class Exercise18 {
    
    private final String noStatic = "no_static";

    private static final String WITH_STATIC = "with_static";

    public static void main(String[] args) {
        System.out.println(new Exercise18().noStatic);    
        System.out.println(Exercise18.WITH_STATIC);
    }
}
