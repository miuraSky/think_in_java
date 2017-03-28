import java.util.ArrayList;
import java.util.List;

public class Exercise23 {

    public static void main(String[] args) {
        printU(new Medlinker("medical-linker").structer());

        System.out.println("---------------------------");

        MedicalBusiness mb = new MedicalBusiness();
        Medlinker[] mArray = new Medlinker[] { new Medlinker("lipede"), 
                                               new Medlinker("yubaoming"), 
                                               new Medlinker("gujunyu"),
                                               new Medlinker("wangshiry") };

        for (Medlinker m : mArray) {
            mb.storeU(m.structer());
        }

        mb.reCallAll();
    }

    public static void printU(U u) {
        System.out.println("ceo: " + u.ceo());     
        System.out.println("vp: " + u.hostName()); 
        System.out.println("pm: " + u.pm());
    }
}

interface U {

    String ceo();

    String hostName();
    
    String pm();
}

class Medlinker {
    
    String hostName;
    
    Medlinker(String hostName) {
        this.hostName = hostName;
    }

    String getHostName() {
        return this.hostName;
    }
    
    U structer() {
        return new U() {

            @Override
            public String ceo() {
                return "王诗蕊";
            }
            
            @Override
            public String hostName() {
                return Medlinker.this.getHostName();
            }

            @Override
            public String pm() {
                return "理赔的";
            }
        };
    }
}

class MedicalBusiness {
    
    private List<U> uList;

    MedicalBusiness() {
        uList = new ArrayList<U>();
    }

    void storeU(U u) {
        uList.add(u);
    }

    void reCallAll() {
        for (U u : uList) {
            System.out.println("MedlicalBusiness hostName = " + u.hostName());
        }
    }
}
