
public class ReturnAnonymousInnerClass {
    
    public Contents contents() {
        return new Contents() {

            private int i = Integer.MAX_VALUE;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        ReturnAnonymousInnerClass obj = new ReturnAnonymousInnerClass();
        System.out.println(obj.contents().value());
    }
}
