
public class Exercise8 {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            switch(i) {
                case 0: System.out.println("i = " + i);
                        //break;
                case 2: System.out.println("i = " + i);
                        break;
                case 4: System.out.println("i = " + i);
                        break;
                case 8: System.out.println("i = " + i);
                        break;
                default: System.out.println("default: i = " + i);
            }
        }
    }
}
