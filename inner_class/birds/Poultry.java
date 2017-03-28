package birds;

import oviparous.OviAnimal;

public class Poultry {
    
    protected class Chick implements OviAnimal  {
        
        @Override
        public void offspring() {
            System.out.println("Chicken, Chichen");
        }
    }

    protected Chick genChick() {
        return new Chick();
    }

}
