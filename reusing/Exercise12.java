
public class Exercise12 {
    
    public static void main(String[] args) {
        
        Stem stem = new Stem();
        try {
            System.out.println("print............");
        } finally {
            stem.dispose();
        }
    }
}

class Root {
    
    private Component c1 = new Component();

    private Component c2 = new Component();

    private Component c3 = new Component();

    Root() {
        System.out.println("Root - constructor");
    }

    public void dispose() {
        System.out.println("Root - dispose");
    }
}

class Stem extends Root {

    private Component c1 = new Component();
    
    Stem() {
        System.out.println("Stem - constructor");
    }

    @Override
    public void dispose() {
        super.dispose();
        System.out.println("stem - dispose");
    }
}

class Component {
    Component() {
        System.out.println("Component - constructor");
    }
}
