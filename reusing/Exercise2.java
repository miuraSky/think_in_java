
public class Exercise2 extends Detergent {

    @Override
    public void scrub() {
        System.out.println("Exercise2 scrub()");
        super.scrub();
    }

    public void sterilize() {
        System.out.println("Exercise2 sterilize()");
    }

    public static void main(String[] args) {
        Exercise2 ex2 = new Exercise2();

        ex2.scrub();
        ex2.sterilize();
    }
}
