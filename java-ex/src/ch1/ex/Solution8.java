package ch1.ex;

public class Solution8 {

    public String invoke() {
        String word = returnWordWithJoy("I love coding");
        //TODO :

        //아래 코드는 수정하지 말아야 합니다.
        return word;
    }

    //아래의 메서드는 수정하지 말아야 합니다.
    public static String returnWordWithJoy(String str) {
        if(str.equals("")) {
            return "empty value";
        } else {
            return str + "!";
        }
    }
}
