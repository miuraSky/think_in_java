
public class Exercise10 {
    
    public static void main(String[] args) {
        Base c = new Derive();
        c.printName();
    }
}

class Base {
    
    void printName() {
        System.out.println(getName());
    }

    String getName() {
        return "Base";
    }
}

class Derive extends Base {
    
    @Override
    String getName() {
        return "Derive";
    }
}
