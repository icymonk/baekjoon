package Baekjoon.Chapter7;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017 - 7 - 23
 *
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 다음과 같이 변경해서 입력했다.
 *
 * 크로아티아 알파벳	변경
 * č	c=
 * ć	c-
 * dž	dz=
 * ñ	d-
 * lj	lj
 * nj	nj
 * š	s=
 * ž	z=
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
 *
 * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 */
public class Prob9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(alphaCheck(str));
        s.close();
    }

    public static int alphaCheck(String str) {
        int i, count = 0;
        int len = str.length();
        String temp1, temp2 = "";

        for (i = 0; i < len - 1; i++) {
            temp1 = "" + str.charAt(i);
            temp1 += str.charAt(i + 1);
            if (i < len - 2) {
                temp2 = temp1 + str.charAt(i + 2);
            }
            if (isExistCheck(temp1) == true) {
                i++;
                System.out.println("111");
            } else if (isExistCheck(temp2) == true) {
                i = i + 2;
                System.out.println("222");
            }
            temp2 = "";
            count++;
        }
        if (len != i) count++;
        return count;
    }

    public static boolean isExistCheck(String str) {
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < 8; i++) {
            if (str.equals(alpha[i])) {
                return true;
            }
        }
        return false;
    }
}
