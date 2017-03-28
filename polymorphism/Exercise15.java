
class Glyph {
    
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

    void draw() {
        System.out.println("Glyph.draw()");
    }

}

class RoundGlyph extends Glyph {
    
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

class RectangularGlyph extends Glyph {
    
    private int radius = 1;

    RectangularGlyph(int r) {
        radius = r;
        System.out.println("RectangularGlyph.RectangularGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(), radius = " + radius);
    }
}

public class Exercise15 {
    
    public static void main(String[] args) {
        new RectangularGlyph(24);      
    }
}
