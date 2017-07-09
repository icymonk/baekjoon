package Baekjoon.Chapter3;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-09.
 *
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
public class Prob1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(i + 1);
        }
    }
}
