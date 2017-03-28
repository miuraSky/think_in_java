
public class Exercise3 {
    
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes
        for(int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        // Make polymorphism method calls
        for(Shape shp : s) {
            shp.draw();
        }
    }
}

class Shape {
    
    void draw() {
        System.out.println("Shape - draw()");
    }

    void erase() {
        System.out.println("Shape - erase()");
    }

    void change() {
        System.out.println("Shape - change()");
    }
}

class Circle extends Shape {
   
    @Override
    void draw() {
        System.out.println("Circle - draw()");
    }

    @Override
    void erase() {
        System.out.println("Circle - erase()");
    }

    void change() {
        System.out.println("Circle - change()");
    }
}

class Square extends Shape {

    @Override 
    void draw() {
        System.out.println("Square - draw()");
    }

    @Override
    void erase() {
        System.out.println("Square - erase()");
    }

    void change() {
        System.out.println("Square - change()");
    }
}

class Triangle extends Shape {
    
    @Override
    void draw() {
        System.out.println("Triangle - draw()");
    }

    @Override
    void erase() {
        System.out.println("Triangle - erase()");
    }

    @Override
    void change() {
        System.out.println("Triangle - change()");
    }
}

class RandomShapeGenerator {
    
    private java.util.Random rand = new java.util.Random();

    Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
