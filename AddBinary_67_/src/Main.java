import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String s = addBinary("1", "11");
        System.out.println(s);
    }

    public static String addBinary(String a, String b) {
        return (new BigInteger(a, 2)).add(new BigInteger(b, 2)).toString(2);
    }
}