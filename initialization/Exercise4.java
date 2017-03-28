
public class Exercise4 {
    
    Exercise4() {
        System.out.println("Exercise4");
    }

    Exercise4(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Exercise4 e = new Exercise4();
        Exercise4 ex = new Exercise4("hi, fuck exercise4");
    }

}
