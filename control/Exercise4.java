
public class Exercise4 {

    public static void main(String[] args) {
        for (int i = 1; i < 1001; ++i) {
            int j = i; 
            for (int k = 2; k < j; ++k) {
                if ( j % k == 0) {
                    break;
                } 
                
                if (k + 1 == j) {
                    System.out.print(j + ", ");
                }
            }
        }
    }
}


