import java.util.ArrayList;
import java.util.List;

public class leetcode3_1 {
    public int lengthOfLongestSubstring(String s) {
        List<Character> hs=new ArrayList<>();
        int maxlength=0;
        int l=s.length();
        int initial=0;
        int end=0;
        while(end<l){
            if(!hs.contains(s.charAt(end))){
                hs.add((s.charAt(end)));
                maxlength=Math.max(maxlength,hs.size());
                end++;
            }
            else{
                hs.remove(Character.valueOf((s.charAt(initial))));
               initial++;
            }
        }
        return maxlength;
        }
    }