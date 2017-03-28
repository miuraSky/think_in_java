import java.util.List;
import java.util.ArrayList;

public class InstanceInitialization {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){
            add("It");
            this.add("is");
            this.add("a");
            this.add("instance");
            this.add("initialization");
        };

        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
