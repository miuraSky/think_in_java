import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class SetOperations {
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Collections.addAll(set, "A B C D E F G H I J K L".split(" "));

        set.add("M");

        System.out.println("H: " + set.contains("H"));
        System.out.println("N: " + set.contains("N"));

        Set<String> bill = new HashSet<String>();
        Collections.addAll(bill, "H I J K L".split(" "));

        System.out.println("bill in set: " + set.containsAll(bill));

        set.remove("H");
        System.out.println("set: " + set);
        System.out.println("bill in set: " + set.containsAll(bill));

        set.removeAll(bill);
        System.out.println("bill removed from set: " + set);

        Collections.addAll(set, "X Y Z".split(" "));
        System.out.println("'X Y Z' added to set: " + set);
    }
}
