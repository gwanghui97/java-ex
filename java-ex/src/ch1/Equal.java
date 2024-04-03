package ch1;

public class Equal {
    public static void main(String[] args) {


        String name1 = "kim";
        String name2 = new String("kim");


        System.out.println(name1 == name2); // 주소값을 비교 -> false
        System.out.println(name1.equals(name2)); //Java에서 문자열 비교 -> true
    }
}
