
public class Exercise1 {
    
    public static void main(String[] args) {
        LazyInitializtion instance1 = LazyInitializtion.getInstance();
        LazyInitializtion instance2 = LazyInitializtion.getInstance();
        LazyInitializtion instance3 = LazyInitializtion.getInstance();
        LazyInitializtion instance4 = LazyInitializtion.getInstance();
    }

}

class LazyInitializtion {
    
    private LazyInitializtion() {
        System.out.println("currentTimeMillis: " + System.currentTimeMillis());
    }

    public static LazyInitializtion getInstance() {
        return InstanceHolder.instance;
    }

    private static final class InstanceHolder {
        
        private static final LazyInitializtion instance = new LazyInitializtion();
    }
}
