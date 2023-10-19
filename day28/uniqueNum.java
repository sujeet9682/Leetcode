package day28;

import java.util.HashMap;
import java.util.HashSet;

public class uniqueNum {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        
        for(int val:arr){
            if(map.containsKey(val)){
               map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }
        for(int val:map.keySet()){
            hs.add(map.get(val));
        }
        if(map.size() == hs.size()){
            return true;
        }
            return false;
    }
}
