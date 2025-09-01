package JIQ;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void charCount(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0 + 1));
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {

        String s = "Ayush Sharma";
        charCount(s);

    }

}
