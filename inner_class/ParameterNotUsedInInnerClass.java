import java.util.ArrayList;

public class ParameterNotUsedInInnerClass {
    
    public static void main(String[] args) {
        AnonymousConstructor obj = new AnonymousConstructor();
        Base b = obj.getBase(Integer.MAX_VALUE);
        b.f("bbbqqq");

        System.out.println("=========================");
        ArrayList<String> arrayList = new ArrayList<String>() {
            { 
                add("尖头");
                add("蠢货");
            }
        };

        for (String s : arrayList) {
            System.out.println("arrayList-s: " + s);        
        }
    }
}

abstract class Base {
    
    public Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }

    public abstract void f(String fs);
}

class AnonymousConstructor {
    
    public Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer.");
                f("fs-1");
            }

            @Override
            public void f(String fs) {
                System.out.println("In anonymous f(): " + fs);
            }
        };
    }
}
