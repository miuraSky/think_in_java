
public class Exercise3 {
    
    public static void main(String[] args) {
        Outer outer = new Outer("outer string");
        Outer.Inner inner = outer.reInner();
            
        System.out.println(inner);
    }
}

class Outer {
    private String os;

    Outer(String os) {
        this.os = os;
    }

    Inner reInner() {
        return new Inner();
    }
    
    class Inner {
        
        Inner() {
            System.out.println("Inner..");
        }

        @Override
        public String toString() {
            return os;
        }
    }
}
