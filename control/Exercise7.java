
public class Exercise7 {
    
    public static void main(String[] args) {
        
        for(int i = 1; i < 100; ++ i) {
            if (i == 99) {
            System.out.println(i);
                return ;
            }

            System.out.print(i + ", ");
        }
        System.out.println(100);
    }
}
