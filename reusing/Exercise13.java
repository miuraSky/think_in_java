
public class Exercise13 {
    
    public static void main(String[] args) {
        Derive derive = new Derive();

        derive.overload("s");
        derive.overload(10.2F);
        derive.overload('x');
        derive.overload(15678);
    }
}

class Base {

    String overload(String s) {
        System.out.println("Base overload(String): s = " + s);
        return s;
    }

    String overload(float f) {
        System.out.println("Base overload(float): f = " + f); 
        return null;
    }

    String overload(char c) {
        System.out.println("Base overload(char): c = " + c);
        return null;
    }

}

class Derive extends Base {
    
    int overload(int s) {
        System.out.println("Derive overload(int): s = " + s);

        return 0;
    }
}
