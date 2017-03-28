
public class Exercise16 {
    
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
        runner.change();
        runner.run();
    }
}

class Programor {
    
    void coding() {
    }
}

class PHPor extends Programor {
    
    @Override
    void coding() {
        System.out.println("coding PHP");
    }
}

class Javaer extends Programor {
    
    @Override
    void coding() {
        System.out.println("coding Java");
    }
}

class Runner {
    
    private Programor p;

    Runner() {
        p = new PHPor();
    }

    void change() {
        p = new Javaer();
    }

    void run() {
        p.coding();
    }
}

