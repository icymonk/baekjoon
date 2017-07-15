package Baekjoon.Chapter6;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-11.
 */
public class Prob3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String temp;
        int len,stack=0,score=0;
        for (int i = 0; i < N; i++) {
            s.nextLine();
            temp = s.nextLine();
            len = temp.length();

            for (int j = 0; j < len; j++) {
                if(temp.charAt(j) == 'O'){
                    stack++;
                    score+=stack;
                } else {
                    stack = 0;
                }
            }
            System.out.println(score);
        }
    }
}
