
public class Exercise11 {
    
    public static void main(String[] args) {
        
    }
}

class Cleanser {
    
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append("dilute()");
    }

    public void apply() {
        append("apply()");
    }

    public void scrub() {
        append("scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();

        System.out.println(x);
    }
}

class CleanserDelegation {
    
    private Cleanser delegation = new Cleanser();

    public void append(String a) {
        delegation.append(a);
    }

    public void dilute() {
        delegation.dilute();
    }

    public void apply() {
        delegation.apply();
    }

    public void scrub() {
        delegation.scrub();
    }

    @Override
    public String toString() {
        return delegation.toString();
    }

    public static void main(String[] args) {
        Cleanser.main(args);
    }

}


class Detergent {

    private CleanserDelegation delegation = new CleanserDelegation();

    // Change a method
    public void scrub() {
        System.out.println("Detergent: scrub()");
        delegation.append(" Detergant.scrub()");
        delegation.scrub();
    }

    // Add method to the interface
    public void foam() {
        delegation.append(" foam()");
    }

    public void dilute() {
        delegation.dilute();
    }

    public void apply() {
        delegation.apply();
    }

    // Test the new class
    public static void main(String[] args) {
        Detergent x = new Detergent(); 

        x.dilute();
        x.apply();
        x.scrub();
        x.foam();

        System.out.println(x);
        System.out.println("Testing base class:");
        CleanserDelegation.main(args);
    }
}
