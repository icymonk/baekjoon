package Baekjoon.Chapter7;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-19.
 *
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
 * 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */
public class Prob1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.next().charAt(0);
        System.out.printf("%d", n);
        s.close();
    }
}
