package Baekjoon.Chapter3;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-09.
 *
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
public class Prob2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = N; i > 0; i--) {
            System.out.println(i);
        }
    }
}
