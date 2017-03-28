
public class Exercise9 {
    
    public static void main(String[] args) {
        
        Stem stem = new Stem();
    }
}

class Root {
    
    private Component c1 = new Component();

    private Component c2 = new Component();

    private Component c3 = new Component();

    Root() {
        System.out.println("Root - constructor");
    }
}

class Stem extends Root {

    private Component c1 = new Component();
    
    Stem() {
        System.out.println("Stem - constructor");
    }
}

class Component {
    Component() {
        System.out.println("Component - constructor");
    }
}
