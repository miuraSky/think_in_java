import exercisepackage.ForExercise4;
import exercisepackage.ForExercise4Call;

public class Exercise4 {
    
    public static void main(String[] args) {
        ForExercise4 e4 = new ForExercise4();
        ForExercise4Call e4c = new ForExercise4Call();

        // Show that protected methods have package access but are not public
        // e4.method(); 
        e4c.call();
    }
}
