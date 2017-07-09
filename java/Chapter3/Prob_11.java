package Baekjoon.Chapter3;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-09.
 *
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 */
public class Prob11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        method1(str);   // 1문자씩 출력, 10문자 출력후 줄바꿈
        System.out.println();
        System.out.println();
        method2(str);   // substring을 이용하여 출력
    }

    public static void method1(String str){
        int len = str.length();
        for (int i = 0; i < len; i++) {
            System.out.printf("%c", str.charAt(i));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static void method2(String str){
        int row = (str.length()-1)/10 + 1;      //줄의 개수 구하기
        for (int i = 0; i < row - 1; i++) {
            System.out.println(str.substring(i*10,(i+1)*10));
        }
        System.out.println(str.substring((row-1)*10, str.length()));    //마지막줄 출력
    }


}
