package BackJoon.Chapter2;

import java.util.Scanner;

/**
 * Created by cjnote on 17. 6. 28.
 *
 * A/B를 계산하시오.
 */
public class Prob4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println((double)a/b);
        s.close();
    }
}
