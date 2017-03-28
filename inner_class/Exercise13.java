public class Exercise13 {
    
    public Destination destination(final String s) {
        return new Destination() {
            @Override            
            public String readLabel() {
                System.out.println("readLabel - s: " + s);
                return s;
            }
        };
    }

    public static void main(String[] args) {
        Exercise13 obj = new Exercise13(); 
        Destination d = obj.destination("China-exercise13");
        System.out.println(d.readLabel());
    }
}
