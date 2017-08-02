package Baekjoon.Chapter8;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017 - 7 - 23
 *
 * 무한히 큰 배열에 다음과 같이 분수들을 적혀있다.
 *
 * 1/1	1/2	1/3	1/4	1/5	…
 * 2/1	2/2	2/3	2/4	…	…
 * 3/1	3/2	3/3	…	…	…
 * 4/1	4/2	…	…	…	…
 * 5/1	…	…	…	…	…
 * …	…	…	…	…	…
 * 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 *
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */
public class Prob3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();

        System.out.println(findFractionalNumber(X));
        s.close();
    }

    public static String findFractionalNumber(int X) {
        int Line = findLine(X);
        int gap = X - Line * (Line - 1) / 2;

        return (Line - gap + 1) + "/" + gap;
    }

    public static int findLine(int X) {
        int i;
        for (i = 0; X >= i * (i + 1) / 2; i++) {
        }

        return i;
    }
}
