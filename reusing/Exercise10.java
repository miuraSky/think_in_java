
public class Exercise10 {
    
    public static void main(String[] args) {
        
        Stem stem = new Stem("stem");
    }
}

class Root {
    
    private Component c1 = new Component(1);

    private Component c2 = new Component(2);

    private Component c3 = new Component(3);

    Root(String s) {
        System.out.println("Root - constructor: " + s);
    }
}

class Stem extends Root {

    private Component c1 = new Component(4);
    
    Stem(String s) {
        super(s);
        System.out.println("Stem - constructor: " + s);
    }
}

class Component {
    Component(int i) {
        System.out.println("Component - constructor: " + i);
    }    
}
