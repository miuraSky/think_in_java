
public class Exercise17 {
    
    public static void main(String[] args) {
        Cycle c1 = new Cycle();
        Cycle c2 = new Unicycle();
        Cycle c3 = new Bicycle();
        Cycle c4 = new Tricycle(); 

        c1.ride();
        c2.ride();
        c3.ride();
        c4.ride();

        System.out.println("=====================================");

        ((Tricycle)c4).balance();

        ((Tricycle)c3).balance();
    }
}

class Cycle {
    
    void ride() {
        System.out.println("Cycle - ride()");
    }
}

class Unicycle extends Cycle {
    
    @Override
    public void ride() {
        System.out.println("Unicycle - ride()");
    }
}

class Bicycle extends Cycle {
    
    @Override
    public void ride() {
        System.out.println("Bicycle - ride()");
    }
}

class Tricycle extends Cycle {
    
    @Override
    public void ride() {
        System.out.println("Tricycle - ride()");
    }

    public void balance() {
        System.out.println("Tricycle - balance()");
    }
}

