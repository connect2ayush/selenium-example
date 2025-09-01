package JIQ;

import java.util.Arrays;

public class isAnagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        Arrays.equals(ch1, ch2);
        return true;
    }

    public static void main(String[] args) {

        String s1 = "vriti";
        String s2 = "ritvi";
        System.out.println(isAnagram(s1, s2));

    }
}
