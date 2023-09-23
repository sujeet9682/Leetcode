import java.util.HashSet;

public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int maxlength=0;
        int l=s.length();
        int initial=0;
        int end=0;
        int count=0;
        int i=0;
        while(end<l){
            if(hs.contains(s.charAt(end))){
                initial+=1;
                count=0;
                while(i<end){
                    hs.remove(s.charAt(i));
                    i++;
                }
                end=initial-1;
            }
            else{
                hs.add(s.charAt(end));
                count++;
            }
            if(maxlength<count)
            maxlength=count;
            end++;
            i=0;
        }
        return maxlength;
        }
    }
