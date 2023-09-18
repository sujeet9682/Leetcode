public class leetcode1.2 {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map=new HashMap();

       for(int i=0; i<nums.length; i++){
           map.put(nums[i],i);
       }

       for(int i=0;i<nums.length-1; i++){
           int num=nums[i];
           int search=target-num;
           if(map.containsKey(search)){
               int index=map.get(search);
               if(index==i)continue;
               return new int[]{i,index};
           }
       }
return new int[]{};
}
}
