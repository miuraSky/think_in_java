
public class NestingAClassWithinAMethod {
    
    public Destination destination(String s) {

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
    }

    public static void main(String[] args) {
        NestingAClassWithinAMethod obj = new NestingAClassWithinAMethod(); 
        Destination d = obj.destination("China");
        System.out.println(d.readLabel());
    }
}
