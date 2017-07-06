package Baekjoon.Chapter1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by CJdesktop on 2017-07-06.
 *
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 *
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 * 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 */
public class Prob8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String temp;
        String reg = "^[a-zA-Z0-9 ]*$";
        int count = 0;
        do {
            temp = s.nextLine();
            if(temp.isEmpty()){
                System.out.println();
            }
            else if (Pattern.matches(reg, temp)) {
                System.out.println(temp);
                count++;
            }
            System.out.println("count = " + count);
        } while (count != 100);
    }
}
