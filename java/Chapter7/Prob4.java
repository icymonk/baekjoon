package Baekjoon.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by CJdesktop on 2017 - 7 - 19
 *
 * 알파벳 대소문자로 된 단어가 주어지면,
 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 */
public class Prob4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[26];
        String str = s.nextLine();
        int len = str.length();
        int max = 0, count = 0, temp = 0;
        str = str.toLowerCase();

        for (int i = 0; i < len; i++) {
            arr[str.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                count++;
                temp = i;
            }
        }

        if (count == 1) {
            System.out.printf("%c", temp + 97);
        } else {
            System.out.printf("?");
        }

        s.close();
    }
}
