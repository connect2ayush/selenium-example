package Collections;

import java.util.HashMap;

public class LastRepeatingChar {

    public static void findLastRepeatingCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Traverse from the end to find the last repeating character
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (map.get(c) > 1) {
                System.out.println("Last repeating character: '" + c + "'");
                return;
            }
        }

        // If no repeating character found
        System.out.println("No repeating character found.");
    }

    public static void main(String[] args) {
        String input = "hello world!";
        findLastRepeatingCharacter(input);
    }
}
