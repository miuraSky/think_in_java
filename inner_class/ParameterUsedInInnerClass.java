
public class ParameterUsedInInnerClass {
    
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(new ParameterUsedInInnerClass().destination("readLabel").readLabel());
    }
}
