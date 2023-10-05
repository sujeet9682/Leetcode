public class leetcode35 {
        public int searchInsert(int[] nums, int target) {
            int l=nums.length;
            int up=l-1;
            int down=0;
            while(down<=up){
                int mid=(up+down)/2;
                if(nums[mid]==target)
                return mid;
    
                else if(nums[mid]>target)
                up=mid-1;
    
                else
                down=mid+1;
            }
            return down;
    }
}
