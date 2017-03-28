public class Exercise12 {
    
    public static void main(String[] args) {
        ChinaMachine cm = new ChinaMachine("中华民国"); 
        System.out.println(cm.getName());

        cm.chief().changeName("中华共哈哈");
        System.out.println(cm.getName());
    }
}

class ChinaMachine {
    
    private String name;

    ChinaMachine(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Chief chief() {
        return new Chief() {
            @Override
            public void changeName(String newName) {
                ChinaMachine.this.name = newName;
            }
        }; 
    }

    public interface Chief {
        
        void changeName(String newName); 
    }
}
