package Baekjoon.Chapter3;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-09.
 *
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */
public class Prob4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
