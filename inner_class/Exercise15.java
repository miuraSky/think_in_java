public class Exercise15 {
   
    public static void main(String[] args) {
        Mother mother = new Exercise15().motherFucker(); 

        System.out.println("-------- Fucker ---------");
        mother.printMotherName();
    }

    Mother motherFucker() {
        return new Sister("sister", "mother") {
            {
                printSisterName();
                printMotherName();
            }
        };
    } 

}

class Mother {
    
    String name;
    
    Mother() {
    }
    
    Mother(String name) {
        this.name = name; 
    }

    public void printMotherName() {
        System.out.println("Mother name: " + name);
    }
}

class Sister extends Mother {
    
    String name;
    
    Sister(String sisterName, String motherName) {
        super(motherName);
        this.name = sisterName;
    }

    public void printSisterName() {
        System.out.println("Sister name: " + name);
    }
}
