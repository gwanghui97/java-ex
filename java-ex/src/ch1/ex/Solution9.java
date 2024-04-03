package ch1.ex;

public class Solution9 {
    public static void main(String[] args) {

    }
    public static String type() {
        int num = 3;
        char thing = 'A';

        //TODO :
        //아래 코드는 수정하지 말아야 합니다.
        return goCheck(num, thing);
    }

    //아래 메소드는 수정하지 말아야 합니다.
    public static String goCheck(int num, char thing) {
        return String.format("코딩아, 공구함에 있는 건전지말야. %c가 %d개 들어있는게 맞니?", thing, num);
    }
}
