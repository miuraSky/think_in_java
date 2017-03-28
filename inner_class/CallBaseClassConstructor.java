
public class CallBaseClassConstructor {
    
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 10;
            }
        };
    }

    public static void main(String[] args) {
        CallBaseClassConstructor obj = new CallBaseClassConstructor(); 
        System.out.println(obj.wrapping(112).value());
    }
}
