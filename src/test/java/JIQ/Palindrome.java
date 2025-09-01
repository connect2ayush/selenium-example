package JIQ;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        // Clean the string: remove non-alphanumeric characters, convert to lowercase
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] ch = cleaned.toCharArray(); // use cleaned string, not original
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            if (ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(isPalindrome(str)); // should print false
    }
}
