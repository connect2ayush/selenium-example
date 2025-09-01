package JIQ;

import java.util.HashMap;

public class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {

        // Remove spaces and make lowercase (optional normalization)
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Quick length check
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count characters in str1
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Subtract counts using str2
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false; // character not found
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) < 0) {
                return false; // more occurrences in str2
            }
        }

        // If all counts are zero, it's an anagram
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Are they anagrams? " + isAnagram(str1, str2));
    }
}
