package BackJoon.Chapter2;

import java.util.Scanner;

/**
 * Created by cjnote on 17. 6. 28.
 *
 * (A+B)%C는 (A%C + B%C)%C 와 같을까?
 * (A×B)%C는 (A%C × B%C)%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
 *
 */
public class Prob6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);

        s.close();
    }
}
