
public class Exercise17 {
    
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.swing();
    }
}

class Amphibian {
    
    public void swing() {
        System.out.println("Amphibian swing");
    }
}

class Frog extends Amphibian {
    
    @Override
    public void swing() {
        System.out.println("Frog swing");
    }
}
