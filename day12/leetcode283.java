public class leetcode283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
