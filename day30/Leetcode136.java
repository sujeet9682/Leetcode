import java.util.HashMap;
import java.util.Map;

public class Leetcode136 {
	    public int singleNumber(int[] nums) {
	        Map<Integer, Integer> hs=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            if(!hs.containsKey(nums[i])){
	                hs.put(nums[i],1);
	            }
	            else{
	                hs.put(nums[i],hs.get(nums[i])+1);
	            }
	        }
	        for(int val:hs.keySet()){
	            if(hs.get(val)==1) return val;
	        }
	        return 0;
	    }
	    
	    public static void main (String args[]) {
	    	int[] arr= {1,2,5,3,4,2,5,4,1};
	    	Leetcode136 out=new Leetcode136();
	    	int max= out.singleNumber(arr);
	    	System.out.println(max);
	    }
}
