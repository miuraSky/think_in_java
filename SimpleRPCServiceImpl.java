
public class SimpleRPCServiceImpl implements SimpleRPCService {
    
    @Override
    public String sayHello(String input) {
        return input + ", welcome!";
    }
}

