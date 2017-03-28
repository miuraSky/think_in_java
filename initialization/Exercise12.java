
public class Exercise12 {
    
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank = null;
        System.gc();

        tank = new Tank();
        tank.stopSwept();
        tank = null;

        System.gc();
    }
}

class Tank {
    
    boolean swept;

    Tank() {
        swept = true;
    }

    void stopSwept() {
        swept = false;
    } 

    protected void finalize() {
        System.out.println("swept: " + swept + "\n");
    }
}
