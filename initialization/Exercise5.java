
public class Exercise5 {
    
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark(10);
        dog.bark(true);
        dog.bark(7.0F);
    }
}

class Dog {
    
    void bark(int i) {
        System.out.println("bark int: " + i);
    }

    void bark(float f) {
        System.out.println("bark float: " + f);
    }

    void bark(boolean b) {
        System.out.println("bark boolean: " + b);
    }
}


