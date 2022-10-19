import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXV"));
    }

    public static int romanToInt(String s){
        String[] allowedItems = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values =  {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        if(s.length()>=1&&s.length()<=15&& Arrays.stream(allowedItems).anyMatch(s::contains)){
            int sum=0;
            for(int i=0;i< allowedItems.length;i++){
                while (s.startsWith(allowedItems[i])){
                    sum+= values[i];
                    System.out.println(i +" " + s);
                    s = s.substring(allowedItems[i].length());
                }
            } return sum;

        } return 0;
    }
}