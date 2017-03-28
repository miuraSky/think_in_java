
public class SwitchEnum {
    
    public static void main(String[] args) {
        show(MySwitch.ONE);
        show(MySwitch.TWO);
        show(MySwitch.THREE);
        show(MySwitch.FOUR);
        show(MySwitch.FIVE);
    }

    static void show(MySwitch ms) {
        switch(ms) {
            case ONE:
                System.out.println(MySwitch.ONE.name());
                break;
            case TWO:
                System.out.println(MySwitch.TWO.name());
                break;
            case THREE:
                System.out.println(MySwitch.THREE.name());
                break;
            case FOUR:
                System.out.println(MySwitch.FOUR.name());
                break;
            default:
                System.out.println("What the fuck");
        }
    }
}

enum MySwitch {
    ONE, TWO, THREE, FOUR, FIVE, SIX
}
