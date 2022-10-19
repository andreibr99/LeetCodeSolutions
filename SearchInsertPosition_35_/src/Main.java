public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,5,7};
        int k = searchInsert(nums,7);
        System.out.println(k);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target<nums[0]){
                return 0;
            } else if (nums[i] == target) {
                return i;
            } else if(target>nums[nums.length-1]){
                return nums.length;
            } else if (target >= nums[i] && target < nums[i + 1]) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void print(int[] nums){
        for(int i=0 ; i< nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}