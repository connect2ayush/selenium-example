package JIQ;

import java.util.*;

public class Test {

    public static void countOccurance(String s) {

        HashMap<Character,Integer>  map = new HashMap();
        for (char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }



        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            if(entry.getKey()=='n'){
                System.out.println(entry.getValue());
            }

//            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

    }
    public static void main(String[] args) {
        String test ="my name is ayush sharma";
        countOccurance(test);
    }

}