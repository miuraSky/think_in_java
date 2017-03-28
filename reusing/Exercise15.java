import exercise.Base;

public class Exercise15 {

    public static void main(String[] args) {
        Base base = new Base();
        base.show("hh - show");
        //base.show();
        
        Derive derive = new Derive(); 
        derive.showProtected();
    }
}

class Derive extends Base {
    
    public void showProtected() {
        show();
    }
}
