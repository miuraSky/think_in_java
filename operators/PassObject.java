
class Letter {
    char c;
    float f;
}

public class PassObject {
    
    static void f(Letter y) {
        y.c = 'z';
    }

    static void c(Letter y) {
        y.f = 0.3333F;
    }

    public static void main(String[] args) {
        Letter x = new Letter();
            
        x.c = 'a';
        x.f = 0.001F;

        System.out.println("1: x.c = " + x.c + ", x.f = " + x.f);

        f(x);
        c(x);

        System.out.println("2: x.c = " + x.c + ", x.f = " + x.f);

    }
}
    
