package ex11;

public class HIS {
    
    private class LiuLiWei implements Noob {

        @Override
        public void idiotSpeek() {
            System.out.println("Weng Hoo Ho ooH..");
        }
    }

    public Noob getNoob() {
        return new LiuLiWei();
    }
}
