package ch1;

public class IndexOf {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        System.out.println(str.indexOf("d")); //없으면 -1

        System.out.println(str.contains("A")); //있으면 true
    }
}
