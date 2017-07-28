package Baekjoon.Chapter7;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017 - 7 - 19
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.
 * 다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다.
 * S에는 QR Code "alphanumeric" 문자만 들어있다.
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.
 */
public class Prob3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int N, len;
        String S;
        for (int i = 0; i < T; i++) {
            N = s.nextInt();
            S = s.next();
            len = S.length();
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < N; k++) {
                    System.out.printf("%c", S.charAt(j));
                }
            }
            System.out.println();
        }
        s.close();
    }
}
