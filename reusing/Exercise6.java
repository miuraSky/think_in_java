class Game {
    Game(int i) {
        System.out.println("Game constructor: i = " + i);
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor: i = " + i);
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }

}

public class Exercise6 {
    
    public static void main(String[] args) {
        Chess.main(args);
    }
}


