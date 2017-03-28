
public class Exercise2 {
    
    public static void main(String[] args) {
        int size = 5;
        Sequence sequence = new Sequence(size);

        for (int i = 0; i < size; i++) {
            HoldString hs = new HoldString("Hold-String_" + i);
            sequence.add(hs);
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        System.out.println();
    }
}

class HoldString {
    
    private String hs;
    
    HoldString(String hs) {
        this.hs = hs;
    }

    @Override
    public String toString() {
        return this.hs;
    }
}
