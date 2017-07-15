package Baekjoon.Chapter5;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-11.
 *
 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */
public class Prob2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if(arithmeticCheck(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean arithmeticCheck(int num){
        String temp = "" + num;
        int len = temp.length();
        int sub1,sub2;
        for (int i = 0; i < len-2; i++) {
            sub1 = temp.charAt(i) - temp.charAt(i+1);
            sub2 = temp.charAt(i+1) - temp.charAt(i+2);
            if(sub1 != sub2){
                return false;
            }
        }
        return true;
    }
}
