package Baekjoon.Chapter4;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-10.
 *
 * 세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 */
public class Prob2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        int D1 = A - B;     //A를 기준으로 차이를 구함
        int D2 = A - C;

        if (D1 * D2 < 0) {          //차이가 서로 다른부호일경우 A가 2번째로 큰 정수(가운데값)
            System.out.println(A);
            return;
        } else if (Math.abs(D1) < Math.abs(D2)) {   //기준인 A가 제일 작은수일지 큰수일지 모르므로 절대값으로 비교
            System.out.println(B);                  //A에서부터 거리가 짧은 수가 2번째로 큰 정수(가운데값)
        } else {
            System.out.println(C);
        }


    }
}
