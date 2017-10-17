import java.util.Map;
import java.util.HashMap;

class Building {}

class House extends Building{}

class Schools extends Building {}

class Znh extends Building {}

public class ClassTypeCapture<T> {

    private Class<T> kind;

    private Map<String, Class<?>> typeMap;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
        this.typeMap = new HashMap<>();
    }

    public boolean isSame(Object obj) {
        return kind.isInstance(obj);
    }

    public void addType(String typeName, Class<?> typeClass) {
        typeMap.put(typeName, typeClass);
    }


    public static void main(String[] args) {
        ClassTypeCapture<Building> c1 = new ClassTypeCapture<Building>(Building.class);
        System.out.println(c1.isSame(new House()));
        System.out.println(c1.isSame(new Building()));

        ClassTypeCapture<House> c2 = new ClassTypeCapture<House>(House.class);
        System.out.println(c2.isSame(new House()));
        System.out.println(c2.isSame(new Building()));
    }
}
