
public class Exercise14 {
    
    public static void main(String[] args) {
        
    }
}

interface Shootable {
    
    void shoot();

    void aim();
}

interface Boomable {
    
    void boom();

    void throwIt();
}

interface Fastable {
    
    void fast();

    void lotOf();
}

interface SuperM4 extends Shootable, Boomable, Fastable {
    
    void use();
}
