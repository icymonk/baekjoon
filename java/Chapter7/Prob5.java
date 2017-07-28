package Baekjoon.Chapter7;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017 - 7 - 23
 *
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
public class Prob5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (groupWord(s.next())) {
                count++;
            }
        }
        System.out.println(count);
        s.close();
    }

    public static boolean groupWord(String str) {
        int[] count = new int[26];
        int len = str.length();
        count[str.charAt(0) - 97]++;
        for (int i = 1; i < len; i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (count[str.charAt(i) - 97] != 0) {
                    return false;
                } else {
                    count[str.charAt(i) - 97]++;
                }
            }
        }
//        for (int i : count){
//            System.out.printf("%d, ",i);
//        }
//        System.out.println();
        return true;
    }
}
