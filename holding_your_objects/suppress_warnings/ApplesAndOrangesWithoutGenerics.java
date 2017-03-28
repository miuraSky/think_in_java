import java.util.ArrayList;

class Apple {
    
    public static long counter;

    private final long id = counter ++;

    public long id() {
        return id;
    }
}

class Orange {
}

public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings(value = {"unchecked"}) 
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();        

        apples.add(new Apple());
        apples.add(new Orange());
    }
}
