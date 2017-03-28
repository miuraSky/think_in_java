import java.util.Random;

public class Exercise5 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt = rand.nextInt();

        System.out.println(randInt);
        System.out.println(Integer.toBinaryString(randInt));
        System.out.println(selfToBianryString(randInt));
    }

    // 就是这么个基本算法，我用时超过30分钟
    // 1: check = 1 << i 被误用成check <<= i
    // 2: 三元元算符的优先级别最低，所以tmp = (intVal & check) == check ? "1" : "0" + tmp是错误的。蒙逼好一段时间才发觉
    // 3: tmp.indexOf()误用成tmp.charAt()
    //
    // 所以，最简单直白的算法才显真本事，花哨最后的结果除了尴尬还是尴尬
    private static String selfToBianryString(int intVal) {
        int check = 1;
        String tmp = "";

        for (int i = 0; i < 32; ++i) {
            check = 1 << i;
            tmp = ((intVal & check) == check ? "1" : "0") + tmp;
        }

        for (int i = 0; i < tmp.length(); ++i) {
            if (tmp.charAt(i) != '0') {
                return tmp.substring(i);
            }
        }

        return tmp;
    }
}
