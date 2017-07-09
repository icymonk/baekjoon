package Baekjoon.Chapter3;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-09.
 *
 * 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다.
 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 */
public class Prob8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m = s.nextInt();
        int d = s.nextInt();
        int temp = 0;

        for (int i = 1; i < m; i++) {       //  차이나는 달 만큼 날짜 더하기
            temp += months[i];
        }
        temp += d - 1;                      // 일자 차이 더하기

        System.out.println(days[(temp+1) % 7]);     // 1월1일기준 월요일이므로 temp+1로 계산

    }
}
