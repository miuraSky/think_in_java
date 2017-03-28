
public class Exercise5 {
    
    Exercise4 exercise4;

    public Exercise5() {
        exercise4 = new Exercise4();
        exercise4.dataOnly = new DataOnly();
    }

    public static void main(String[] args) {
        System.out.println(new Exercise5().exercise4.dataOnly);
    }
}

