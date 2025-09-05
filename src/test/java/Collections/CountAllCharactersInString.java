package Collections;

import java.util.HashMap;
import java.util.Map;

public class CountAllCharactersInString {

    public static void countCharacters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "hello world!";
        countCharacters(input);
    }
}
