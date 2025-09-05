package Collections;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void lastRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }

    public static void main(String[] args) {
    String test="ayushsharmaa";
    lastRepeatingChar(test);
    }
}
