package Baekjoon.Chapter4;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-10.
 *
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
public class Prob1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        String result;

        switch (score / 10) {
            case 9:
            case 10:
                result = "A";
                break;
            case 8:
                result = "B";
                break;
            case 7:
                result = "C";
                break;
            case 6:
                result = "D";
                break;
            default:
                result = "A";
                break;
        }
        System.out.println(result);
    }
}
