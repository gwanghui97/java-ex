package ch1;

public class Concat {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println("문자열 : " + str);
        System.out.println(str.concat("수업"));
        System.out.println("concat() 메서드 호출 후 문자열 : " + str);
    }
}
