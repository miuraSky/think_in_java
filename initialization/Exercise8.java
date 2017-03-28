
public class Exercise8 {

    void method() {
        method2();
        this.method2();
    }

    void method2() {
        System.out.println("method 2");
    }
    
    public static void main(String[] args) {
        new Exercise8().method();
    }
}
