
public class Exercise10 {

    protected void finalize() {
        System.out.println("finalize()");
    }
    
    public static void main(String[] args) {
        Exercise10 ex = new Exercise10();
        ex = null;

        System.gc();
    }
}
