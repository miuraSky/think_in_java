
public class Exercise4 {
    
    public static void main(String[] args) {
        Base obj = new Derived();

        obj.show();

        System.out.println("-------------------------------------");

        ((Derived)obj).print();
    }
}

abstract class Base {
    
    abstract void show();
}

class Derived extends Base {

    @Override
    void show() {
        System.out.println("Derived show()");
    }
    
    void print() {
        System.out.println("Derived print()");
    }
}


