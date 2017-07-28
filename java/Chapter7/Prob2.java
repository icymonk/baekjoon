package Baekjoon.Chapter7;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-19.
 *
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
 * 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
public class Prob2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[26];
        String str = s.nextLine();
        int len = str.length();

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < len; i++) {
            if (arr[str.charAt(i) - 97] == -1) {
                arr[str.charAt(i) - 97] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.printf("%d ", arr[i]);
        }
        s.close();
    }
}
