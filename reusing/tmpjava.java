

// Constructor calls during inheritance

class Art {

    Art() {
        System.out.println("Art constructor ");
    }
        
    Art(String art) {
        System.out.println("Art constructor: " + art);
    }
}

class Drawing extends Art {
    
    Drawing() {
        super("my Drawing art");
        System.out.println("Drawing constructor");
    }
}

class Cartoon extends Drawing {

    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    
    public static void main(String[] args) {

        Cartoon x = new Cartoon();
    }
}

public class Exercise3 {
    
    public static void main(String[] args) {
        Cartoon.main(args);
    }
}
