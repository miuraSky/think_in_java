
public class Exercise9 {
    
    public static void main(String[] args) {
        Rodent[] rodents = {
            new Rodent(),
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };

        for (Rodent rodent : rodents) {
            rodent.showWeight();
        }
    }
}

class Rodent {
    
    void showWeight() {
        System.out.println("Rodent weight");
    }
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
