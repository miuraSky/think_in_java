
public class Exercise1 {
    
    public static void main(String[] args) {
        Rodent[] rodents = {
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };

        for (Rodent rodent : rodents) {
            rodent.showWeight();
        }
    }
}

abstract class Rodent {
    
    abstract void showWeight();
}

class Mouse extends Rodent {
    
    @Override
    void showWeight() {
        System.out.println("Mouse weight");
    }
}

class Gerbil extends Rodent {
    
    @Override
    void showWeight() {
        System.out.println("Gerbil weight");
    }
}

class Hamster extends Rodent {
    
    @Override
    void showWeight() {
        System.out.println("Hamster weight");
    }
}
