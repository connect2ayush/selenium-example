package JIQ;

public class ReverseWords {

    public static void main(String[] args) {
        // To only reverse the sentence
        String s = "my name is ayush sharma";
        String[] words = s.split("");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];
        }
        System.out.println(result.trim());

    }
}

 // To reverse sentence and each word
//
//public static void main(String[] args) {
//    String s="my name is ayush sharma";
//    String [] words=s.split("");
//    String result="";
//
//    for (int i = words.length-1; i>=0 ; i--) {
//        result = result + words[i];
//    }
//    System.out.println(result.trim());
//
//}
//
//}