
// Using "instance initialization" to perform construction on an anonymous inner class
public class UseII {
    
    public Destination destination(final String dest, final float price) {
        return new Destination() {

            private int cost;

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }

            // Instance initialization for each object
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }
        };
    }

    public static void main(String[] args) {
        UseII p = new UseII();
        Destination d = p.destination("China", 101.2323F);
    }
}
