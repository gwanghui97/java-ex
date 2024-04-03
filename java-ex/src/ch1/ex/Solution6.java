package ch1.ex;

public class Solution6 {
    public static void main(String[] args) {
        System.out.println(getRunCatDistance(5,7));

    }

    public static int getRunCatDistance(int speed, int time) {
        int distance = speed * time;
        return distance;
    }
}
