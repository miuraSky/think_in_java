public class Games {
    
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();

        while (s.move()) {
            ;
        }
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}

interface Game {
    
    boolean move();
}

interface GameFactory {
    
    Game getGame();
}

class Checkers implements Game {

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };

    private static final int MOVES = 3;

    private int moves = 0;

    private Checkers() {
    }

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class Chess implements Game {

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
    
    private static final int MOVES = 4;

    private int moves = 0;

    private Chess() {
    }

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}
