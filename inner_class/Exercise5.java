
public class Exercise5 {
    
    public static void main(String[] args) {
        ForExercise5 forExercise5 = new ForExercise5(); 
        ForExercise5.Inner inner = forExercise5.new Inner();

        System.out.println(inner);
    }
}
