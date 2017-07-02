package BackJoon.Chapter2;

import java.util.Scanner;

/**
 * Created by cjnote on 17. 6. 28.
 * A-B를 계산하시오.
 */
public class Prob2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a-b);
        s.close();
    }
}
