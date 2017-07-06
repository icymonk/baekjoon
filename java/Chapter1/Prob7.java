package Baekjoon.Chapter1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by CJdesktop on 2017-07-06.
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 *
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 * 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 */
public class Prob7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String temp;
        String reg = "^[a-zA-Z0-9 ]*$";
        int count = 0;
        do {
            temp = s.nextLine();
            if(temp.isEmpty()){
                continue;
            }
            else if (temp.length()<101 && temp.charAt(0) != ' ' && temp.charAt(temp.length() - 1) != ' ' && Pattern.matches(reg, temp)) {
                System.out.println(temp);
                count++;
            }
        } while (count != 100);
        s.close();
    }
}
