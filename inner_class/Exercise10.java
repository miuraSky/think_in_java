
public class Exercise10 {
    
    public Destination destination(String s, boolean b) {
        if (b) {
            class PDestination implements Destination {

                private String label;

                private PDestination(String whereTo) {
                    label = whereTo;
                }

                @Override
                public String readLabel() {
                    return label;
                }
            }

            return new PDestination(s);
        } else {
            return new Destination() {
                
                @Override
                public String readLabel() {
                    return "Anonymous-" + s;
                }
            };
        }
    }

    public static void main(String[] args) {
        Exercise10 obj = new Exercise10(); 
        System.out.println(obj.destination("China", true).readLabel());
        System.out.println(obj.destination("China", false).readLabel());
    }
}
