
public class Exercise7 {
    
    Incrementable incrementable;

    public static void main(String[] args) {
        
        System.out.println(StaticTest.i);

        for (int i = 0; i < 10; ++i) {
            Incrementable.increment();
        }

        System.out.println(StaticTest.i);
    }
}
