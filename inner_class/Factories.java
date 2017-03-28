public class Factories {
    
    public static void sexualServiceConsumer(SexWorker sexWorker) {
        SexualService service = sexWorker.enjoy();

        service.oralSex();
        service.commonSex();
    }

    public static void main(String[] args) {
        sexualServiceConsumer(ZhangXueYing.provideService());
        sexualServiceConsumer(ShiJiaHuan.callSexWorker());
    }
}

interface SexualService {
    
    void oralSex();

    void commonSex();
}

interface SexWorker {
    
    SexualService enjoy();
}

class ZhangXueYing implements SexualService {
    
    private ZhangXueYing() {
    }

    @Override
    public void oralSex() {
        System.out.println("very wet");
    }

    @Override
    public void commonSex() {
        System.out.println("Ying.., Ying.., wet and warm");
    }

    public static SexWorker provideService() {
        return new SexWorker() {
            @Override
            public SexualService enjoy() {
                return new ZhangXueYing();
            }
        };
    }
}

class ShiJiaHuan implements SexualService {
    
    private ShiJiaHuan() {
    }

    @Override
    public void oralSex() {
        System.out.println("smooth and deep");
    }

    @Override
    public void commonSex() {
        System.out.println("Ao.., O..., Tight and narrow");
    }

    public static SexWorker callSexWorker() {
        return new SexWorker() {
            @Override
            public SexualService enjoy() {
                return new ShiJiaHuan();
            }
        };
    }
}



