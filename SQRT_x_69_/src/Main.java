public class Main {
    public static void main(String[] args) {
        mySqrt(2074945124);

    }

    public static int mySqrt(int x){
        System.out.println("The actual result is :" + Math.sqrt(x));
        int i=1;
        while(i*i<=x){
            if(i*i==x){
                System.out.println(i);
                return i;
            }
            i++;
        }
        System.out.println("The rounded result is: " + (i-1));
        return i-1;
    }
}