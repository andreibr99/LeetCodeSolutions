public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(232));
    }


    public static class Solution{
        public boolean isPalindrome(int x){
            if (x<0){
                return false;
            }
            int oldNumber = x;
            int newNumber = 0;

            while(x!=0){
                newNumber = newNumber * 10 + x%10;
                x/=10;
            }
            System.out.println(newNumber);

            return newNumber == oldNumber;
        }
    }
}