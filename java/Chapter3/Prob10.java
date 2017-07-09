package Baekjoon.Chapter3;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-09.
 *
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */
public class Prob10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        String number = s.nextLine();
        int len = number.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        System.out.println(sum);
    }
}
