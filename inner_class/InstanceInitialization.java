
public class InstanceInitialization {
    
    public static void main(String[] args) {
        POJO p = new POJO();
        System.out.println(p);

        p = new POJO() {
            {
                setDeptId(13);
                setDeptName("住院内科");
                setPatientId(11011);
                setPatientName("张谷兰");
            }
        };

        System.out.println(p);
    
}

class POJO {
    
    private int deptId;

    private String deptName;

    private int patientId;

    private String patientName;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId; 
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
        
    @Override
    public String toString() {
        return "[ deptId=" + deptId + ", deptName=" + deptName + 
               ", patientId=" + patientId  + ", patientName=" + patientName + "]";        
    }
}
