public class Main {
    public static void main(String[] args) {
        int[] array = {2};
        int k = removeDuplicates(array,3);
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums,int value) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                int aux = nums[k];
                nums[k] = nums[i];
                nums[i] = aux;
                k++;
            }
        }
        print(nums);
        System.out.println();
        return k;
    }

    public static void print(int[] nums){
        for(int i=0 ; i< nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
