package BackJoon.Chapter2;

import java.util.Scanner;

/**
 * Created by cjnote on 17. 6. 28.
 *
 * 두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 */
public class Prob1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a+b);
        s.close();
    }
}
