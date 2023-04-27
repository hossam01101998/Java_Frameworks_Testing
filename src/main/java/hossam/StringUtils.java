package hossam;

public class StringUtils {

    //OEFENING 4:

    public static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        String invertedWord = sb.reverse().toString();
        System.out.println(invertedWord);
        return word.equals(invertedWord);
    }


    /* public static void main(String[] args) {
        boolean result = isPalindrome("puup");
        System.out.println(result);
    } */






}