
public class Exercise5 {
    
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {

    A(String a) {
        System.out.println("A constructor: " + a);
    }
}

class B {
    B(String b) {
        System.out.println("B constructor: " + b);
    }
}

class C extends A {

    C() {
        super("WTF A");
    }
    
    B b = new B("This is B");;
}
