
// Using inner class for callbacks
public class Callbacks {
    
    public static void main(String[] args) {
        Callee ce = new Callee();
        Callea ca = new Callea();

        MyIncrement.f(ca);

        Caller caller = new Caller(ce);
        Caller c = new Caller(ca.getCallbackReference());

        caller.go();
        caller.go();
        c.go();
        c.go();
    }
}

interface Incrementable {
    void increment();
}

// Very simple to just implement the interface
class Callee implements Incrementable {

    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println("Incrementable: " + i);
    }
}

class MyIncrement {
    
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

// If your class must implement increment() in 
// some other way, you must use an inner class
class Callea extends MyIncrement {
    
    private int i = 0;

    public void increment() {
        super.increment();
        i++;
        System.out.println("MyIncrement: " + i);
    }

    private class Closure implements Incrementable {
        
        // Specify outer-class method, otherwise
        // you'd get an infinite recursion
        @Override 
        public void increment() {
            Callea.this.increment();
        }

    } 

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    
    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}
