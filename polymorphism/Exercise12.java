
public class Exercise12 {
    
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

        System.out.println("====================================");
        new LittleMouse();     
    }
}

class Rodent {

    Rodent() {
        System.out.println("Rodent()");
    }
    
    void showWeight() {
        System.out.println("Rodent weight");
    }
}

class Mouse extends Rodent {

    Mouse() {
        System.out.println("Mouse()");
    }
    
    @Override
    void showWeight() {
        System.out.println("Mouse weight");
    }
}

class LittleMouse extends Mouse {

    DeriveHamster deriveHamster = new DeriveHamster();
    
    DeriveGerbil devriveGerbil = new DeriveGerbil();

    DeriveMouse deriveMouse = new DeriveMouse();
    
    LittleMouse() {
        System.out.println("LittleMouse");
    }

}

class DeriveMouse {

    DeriveMouse() {
        System.out.println("DeriveMouse()");
    }
}

class DeriveGerbil {
        
    DeriveGerbil() {
        System.out.println("DeriveGerbil");
    }
}

class DeriveHamster {
    
    DeriveHamster() {
        System.out.println("DeriveHamster()");
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
