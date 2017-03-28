
public class Exercise6 {
    
    public static void main(String[] args) {
        new SecondClass();
    }
}

class FirstClass {
    
    protected int i = 10;
}

class SecondClass {
    
    SecondClass() {
        System.out.println(new FirstClass().i);
    }
}
