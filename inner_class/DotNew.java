
public class DotNew {
    
    private String os;

    public DotNew(String os) {
        this.os = os;
    }

    public class Inner {
        private String os;

        public Inner(String os) {
            this.os = os;
        }
        
        public void setOuterOS(String os) {
            DotNew.this.os = os;
        }

        public String getOuterOS() {
            return DotNew.this.os;
        }
    }

    public static void main(String[] args) {
        DotNew outer = new DotNew("outer-string"); 
        DotNew.Inner inner0 = outer.new Inner("inner0-String");
        DotNew.Inner inner1 = outer.new Inner("inner1-String");
        DotNew.Inner inner2 = outer.new Inner("inner2-String");
        DotNew.Inner inner3 = outer.new Inner("inner3-String");
    
        System.out.println(inner0.getOuterOS());
        System.out.println(inner1.getOuterOS());
        System.out.println(inner2.getOuterOS());
        System.out.println(inner3.getOuterOS());

        System.out.println("==========================");
        inner0.setOuterOS("inner0-set-outer-string");

        System.out.println(inner0.getOuterOS());
        System.out.println(inner1.getOuterOS());
        System.out.println(inner2.getOuterOS());
        System.out.println(inner3.getOuterOS());

        System.out.println("==========================");
        inner1.setOuterOS("inner1-set-outer-string");

        System.out.println(inner0.getOuterOS());
        System.out.println(inner1.getOuterOS());
        System.out.println(inner2.getOuterOS());
        System.out.println(inner3.getOuterOS());
    }
}
