package ch2;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int i = input.nextInt();

        System.out.println(i);
    }
}
