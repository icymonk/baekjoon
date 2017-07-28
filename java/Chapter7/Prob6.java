package Baekjoon.Chapter7;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017 - 7 - 23
 *
 * 영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까?
 * 이를 구하는 프로그램을 작성하시오. 단, 단어는 띄어쓰기 하나로 구분된다고 생각한다.
 */
public class Prob6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
        s.close();
    }
}
