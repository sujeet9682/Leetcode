class moveZeros {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int j:nums){
            if(j!=0){
                nums[count]=j;
                count++;
            }
        }
        while(count<nums.length){
            nums[count]=0;
            count++;
        }
    }
}