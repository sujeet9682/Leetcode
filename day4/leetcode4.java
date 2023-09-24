public class leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l = l1 + l2;
        int[] nums = new int[l];
        int i = 0, j = 0, k = 0;
        while (i < l1 && j < l2) {
            if (nums1[i] > nums2[j]) {
                nums[k] = nums2[j];
                k++;
                j++;
            } else {
                nums[k] = nums1[i];
                k++;
                i++;
            }
        }
        while (i < l1) {
            nums[k] = nums1[i];
            k++;
            i++;
        }
        while (j < l2) {
            nums[k] = nums2[j];
            k++;
            j++;
        }
        if (l % 2 == 0) {
            j = l / 2;

            return (double) (nums[j - 1] + nums[j]) / 2;
        } else
            return nums[l / 2];
    }
}
