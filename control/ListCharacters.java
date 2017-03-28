
public class ListCharacters {
    
    public static void main(String[] args) {
        for (char c = 0; c < 128; c ++) {
            System.out.print("c = " + c + ": ");
            if (Character.isLowerCase(c)) {
                System.out.println("value = " + (int)c + " character = " + c);
            } else {
                System.out.println("value = " + (int)c);
            } 
        }
    }
}
