
public class Exercise22 {
    
    public static void main(String[] args) {
        switchEE(ExEnum.ONE);
        System.out.println("======================");
        
        switchEE(ExEnum.THREE);
        System.out.println("======================");

        switchEE(ExEnum.TWO);
        System.out.println("======================");

        switchEE(ExEnum.FIVE);
        System.out.println("======================");
    }

    static void switchEE(ExEnum ee) {
        switch(ee) {
            case ONE:
                System.out.println(ExEnum.ONE + ": " + ExEnum.ONE.ordinal());
                break;
            case TWO: 
                System.out.println(ExEnum.TWO + ": " + ExEnum.TWO.ordinal());
            case THREE: 
                System.out.println(ExEnum.THREE + ": " + ExEnum.THREE.ordinal());
            case FOUR: 
                System.out.println(ExEnum.FOUR + ": " + ExEnum.FOUR.ordinal());
                break;
            default:
                System.out.println("default [" + ee + ": " + ee.ordinal() + "]");
                        
        }
    }
}
