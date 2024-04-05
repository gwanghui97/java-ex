package ch2;

public class IfEx2 {
    public static void main(String[] args) {
        boolean condition = true;
        boolean isValid = true;

        if (condition) {
            if (isValid) {
                System.out.println("둘 다 참입니다.");
            }
            //조건식이 참이라면 실행되는 블록입니다.
            System.out.println("조건식이 true로 if문이 실행됩니다.");
        } else {
            System.out.println("조건식이 false로 else문이 실행됩니다.");
        }

        System.out.println("조건문이 끝난 이후 코드입니다.");
    }
}
