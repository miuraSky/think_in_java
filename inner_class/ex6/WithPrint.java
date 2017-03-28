package ex6;

import birds.Poultry;
import oviparous.OviAnimal;

public class WithPrint extends Poultry {

    public OviAnimal print() {
        return genChick(); 
    }
}
