
public class Exercise18 {

    public static void main(String[] args) {
        Foo[] foos = new Foo[20];

        foos[0] = new Foo("HooooO");
    }
    
}

class Foo {
    
    Foo(String s) {
        System.out.println("Foo constructor: " + s);
    }
}

