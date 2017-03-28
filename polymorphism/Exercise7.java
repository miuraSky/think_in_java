import polymorphism.music.Note;

public class Exercise7 {
    
    public static void main(String[] args) {
        Music3.main(args);
    }
}

class Instrument {
    
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    
    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting WindA");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    
    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    
    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }

    @Override
    public String toString() {
        return "Stringed";
    }

}

class Brass extends Wind {
    
    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    String what() {
        return "Woodwind";
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}

class NoobChao extends Instrument {

    @Override
    void play(Note n) {
        System.out.println("NoobChao.play() " + n);
    }

    @Override
    String what() {
        return "NoobChao";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting NoobChao");
    }

    @Override
    public String toString() {
        return "NoobChao";
    }

}

class Music3 {
    // Doesn't care about type, so new types added to the system still work right
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument... e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    static void tuneAllToString(Instrument... e) {
        for (Instrument i : e) {
            System.out.println(i);
        }
    }

    static void main(String... args) {
        // Upcasting during addition to the array        
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
            new NoobChao()
        };

        tuneAll(orchestra);

        System.out.println("-------------------");

        tuneAllToString(orchestra);
    }
}

