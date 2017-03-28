
public class Exercise3 {
    
    public static void main(String[] args) {
        Derived derived = new Derived(-10);
        derived.print();
    }
}

abstract class Base {
    
    Base() {
        print();// Never do this: call polymorphism method in constructor
    }

    abstract void print();
}

class Derived extends Base {
    
    int value = 7;

    Derived(int value) {
        this.value = value;
    }

    @Override
    void print() {
        System.out.println("value = " + value);
    }
}
