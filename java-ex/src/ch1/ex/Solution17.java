package ch1.ex;

public class Solution17 {
    public static void main(String[] args) {
        String word1 = "JAVA";
        String word2 = "java";

//        String lowerWord1 = word1.toLowerCase();
//        String lowerWord2 = word1.toLowerCase();
//        System.out.println(lowerWord1);
//        System.out.println(lowerWord2);
//
//        System.out.println(lowerWord1.equals(lowerWord2));

        System.out.println(word1.equalsIgnoreCase(word2));
    }
}
