package ch1;

public class Trim {
    public static void main(String[] args) {
        String str = "  Java     Spring ";
        System.out.println(str.trim()); //양옆 공백만 제거
        System.out.println(str.replace("a", "")); //a를 빈 문자열로 대체
        //ReplaceAll은 정규표현식에서 자주 씀
    }
}
