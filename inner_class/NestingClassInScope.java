
public class NestingClassInScope {
    
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                
                private String id;

                TrackingSlip(String s) {
                    this.id = s;
                }

                String getSlip() {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("slip");
            System.out.println(ts.getSlip());
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        new NestingClassInScope().track();
    }
}
