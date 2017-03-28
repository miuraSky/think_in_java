import java.util.List;
import java.util.ArrayList;

public class Exercise8 {

    public static void main(String[] args) {
        
        for (int i = 0; i < ConnectionManager.INIT_SIZE + 2; ++i) {
            System.out.println(ConnectionManager.retriveConnection());
        }
    }
}

class ConnectionManager {
    static int INIT_SIZE = 5;

    static int IDX = 0;

    private static List<Connection> CONNECTIONS = new ArrayList<>();

    private ConnectionManager(int initSize) {
        System.out.println("initSize: " + initSize);

        if (initSize <= 0) {
            initSize = INIT_SIZE;
        }

        for (int i = 0; i < initSize; ++i) {
            CONNECTIONS.add(new Connection(i));
        }
    }

    private static ConnectionManager MANAGER = new ConnectionManager(INIT_SIZE);

    synchronized public static Connection retriveConnection() {
        if (IDX == INIT_SIZE) {
            return null;
        }

        return CONNECTIONS.get(IDX++);
    }

}

class Connection {
    
    private int idx;

    Connection(int idx) {
        this.idx = idx;
    }

    int getIdx() {
        return idx;
    }

    @Override
    public String toString() {
        return "idx: " + getIdx();
    }
    
}
