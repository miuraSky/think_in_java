
public class Exercise1 {
    
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.reInner();
    }
}

class Outer {

    Inner reInner() {
        return new Inner();
    }
    
    class Inner {
        
        Inner() {
            System.out.println("Inner..");
        }
    }
}
