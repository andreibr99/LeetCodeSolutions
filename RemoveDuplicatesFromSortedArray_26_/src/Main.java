public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,2};
        int k = removeDuplicates(array);
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1] && nums[i + 1] > nums[k - 1]) {
                int aux = nums[k];
                nums[k] = nums[i + 1];
                nums[i + 1] = aux;
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
