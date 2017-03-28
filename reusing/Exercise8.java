
public class Exercise8 {
    
    public static void main(String[] args) {
        
        Derive d1 = new Derive();
        Derive d2 = new Derive("args - CEO");
    }
}

class Base {
    Base() {
        System.out.println("Base no-args constructor");
    }
}

class Derive extends Base {
    
    Derive() {
        super();
        System.out.println("Derive no-args constructor");
    }

    Derive(String s) {
        super();
        System.out.println("Derive args constructor: args = " + s);
    }
}
