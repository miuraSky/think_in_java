
public class Exercise6 {
    
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark(10);
        dog.bark(true);
        dog.bark(7.0F);
        dog.bark("rat", 5);
        dog.bark(10, "rat");
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

    void bark(String s, int i) {
        System.out.println("bark String and int: " + s + ", " + i);
    }

    void bark(int i, String s) {
        System.out.println("bark int and String: " + i + ", " + s);
    }
}


