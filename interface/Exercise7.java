
public class Exercise7 {
    
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

interface Rodent {
    
    void showWeight(); 
}

class Mouse implements Rodent {
    
    @Override
    public void showWeight() {
        System.out.println("Mouse weight");
    }
}

class Gerbil implements Rodent {
    
    @Override
    public void showWeight() {
        System.out.println("Gerbil weight");
    }
}

class Hamster implements Rodent {
    
    @Override
    public void showWeight() {
        System.out.println("Hamster weight");
    }
}
