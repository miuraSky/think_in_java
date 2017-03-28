
// Demonstrates the while loop
public class WhileTest {
    
    static boolean condition() {
        double rand = Math.random();
        boolean result = rand < 0.99;
        System.out.print("rand = " +  rand + ", result = " + result + ", ");

        return result;
    }

    public static void main(String[] args) {
        while(condition()) {
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");
    }
}
