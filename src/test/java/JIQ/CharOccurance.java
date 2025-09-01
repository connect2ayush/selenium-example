package JIQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CharOccurance {

    public static void main(String[] args) {

        String s ="ayush sharma";
       HashMap<Character,Integer> map=new HashMap<>();

       for(char ch : s.toCharArray()){
//           map.put(ch, map.getOrDefault(ch, 1));
           map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(Map.Entry<Character,Integer> entry:map.entrySet()){
        if(entry.getKey()=='s'){
            System.out.println(entry.getValue());
        }
       }
    }
}
