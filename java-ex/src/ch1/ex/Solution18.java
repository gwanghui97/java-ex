package ch1.ex;

public class Solution18 {
    public static void main(String[] args) {
        int hour, min, sec;
        hour = 17;
        min = 23;
        sec = 11;

        //현재 시각은 17시 23분 11초 입니다.
        String str = "현재 시각은 " + hour + "시 " + min + "분 " + sec + "초 입니다.";
        System.out.println(str);
//        System.out.println(String.format("현재 시각은 %s시 %분 %초 입니다.", hour, min, sec));
    }
}
