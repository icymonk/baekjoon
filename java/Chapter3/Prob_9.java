package Baekjoon.Chapter3;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-09.
 *
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */
public class Prob9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
        System.out.println(sum);
    }
}
