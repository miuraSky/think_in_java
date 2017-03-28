package exercisepackage;

public class ForExercise4Call {
    
    public void call() {
        ForExercise4 f4 = new ForExercise4();
        // protected method have package access
        f4.method();
    }

    public static void main(String[] args) {
        ForExercise4Call fec = new ForExercise4Call();
        fec.call();
    }
}
