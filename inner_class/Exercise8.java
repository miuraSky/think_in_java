public class Exercise8 {
    
    public static void main(String[] args) {
        new Outer().accessInnerPrivate();
        //System.out.println(new Outer().new Inner().what());
    }
}

class Outer {
    
    void accessInnerPrivate() {
        System.out.println(new Inner().i);
        System.out.println(new Inner().what());
    }

    class Inner {
        
        private int i = 17803;

        private String what() {
            return "what";
        }
    }
}
