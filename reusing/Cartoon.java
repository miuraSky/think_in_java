
// Constructor calls during inheritance

class Art {
//    private Art art = new Art();

    Art() {
        System.out.println("Art constructor ");
    }
        
    
    /*
    Art(int art) {
        System.out.println("Art constructor: " + art);
    }
    */

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

public class Cartoon extends Drawing {

    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    
    public static void main(String[] args) {

        Cartoon x = new Cartoon();
    }
}
