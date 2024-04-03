package ch1;

public class StringMethod {
    public static void main(String[] args) {
        String name1 = "kim";
        String name2 = "kim";

        System.out.println(name1.length());
        System.out.println(name1.charAt(2));

        String str = new String("abcd");
        System.out.println("문자열 : " + str);
        System.out.println(str.compareTo("bcef")); //다르면 -1
        System.out.println(str.compareTo("abcd") + "\n"); //같으면 0
    }
}
