
class Shared {
    
    private static long counter = 0;

    private int refcount = 0;

    private final long id = counter++;

    Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {

    private static long counter = 0;
    
    private Shared shared;

    private final long id = counter++;

    Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

class ReferenceCounting {
    
    public static void main(String[] args) {
        Shared shared = new Shared();

        Composing[] composing = { 
            new Composing(shared),  
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };

        for (Composing c : composing) {
            c.dispose();
        }
    }

    protected void finalize() {
        System.out.println("ReferenceCounting ---- finalize()");
    }
}

public class Exercise13 {

    public static void main(String[] args) {
        ReferenceCounting rc = new ReferenceCounting();
        rc.main(args);
        rc = null;

        System.out.println("---------------------------");

        System.gc();
    }
}
