
// a compilation unit with public class's name equals to java-file name
public class Exercise5 {
    
    public static void main(String[] args) {
        
    }
}

// private class ClassOne {
//         Exercise5.java:19: 错误: 此处不允许使用修饰符protected
//         protected class ClassTwo {
//                   ^
//                   Exercise5.java:28: 错误: 类ClassThree是公共的, 应在名为 ClassThree.java 的文件中声明
//                   public class ClassThree {
//                          ^
//                          3 个错误
//
private class ClassOne {

    boolean priboo;
    
    void method() {
        System.out.println(this.getClass() + ": package-access method");
    }
}

protected class ClassTwo {

    boolean priboo;

    void method() {
        System.out.println(this.getClass() + ": package-access method");
    }
}

public class ClassThree {
    boolean priboo;

    void method() {
        System.out.println(this.getClass() + ": package-access method");
    }
}
