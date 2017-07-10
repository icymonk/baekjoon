package Baekjoon.Chapter4;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-10.
 *
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 * 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class Prob3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int X = s.nextInt();
        int temp;
        for (int i = 0; i < N; i++) {
            temp = s.nextInt();
            if (temp < X) {
                System.out.printf("%d ", temp);
            }
        }
    }
}
