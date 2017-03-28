
public class Exercise9 {
    
    String sleep = "initial value";
    
    Exercise9() {
        this("from non-constructor");
    }

    Exercise9(String s) {
        this.sleep = s;
    }

    public static void main(String[] args) {
        Exercise9 e1 = new Exercise9();
        Exercise9 e2 = new Exercise9("big noise");

        System.out.println(e1.sleep);
        System.out.println(e2.sleep);
    }
} 
