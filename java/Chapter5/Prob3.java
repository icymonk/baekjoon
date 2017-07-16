package Baekjoon.Chapter5;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-11.
 *
 * 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 첫째 줄에 N이 주어진다. N은 항상 3*2^k 수이다. (3, 6, 12, 24, 48, ...) (k<=10)
 *
 */
public class Prob3 {
    static int[][] arr;
    static int N;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        int x = N-1;
        int y = 0;
        arr = new int[2 * N - 1][N];
        System.out.println(calcK(N));
        setArray(x,y,N);
        drawStar();
        s.close();
    }

    public static int calcK(int N) {
        int temp = N / 3;
        for (int i = 0; i < 11; i++) {
            if (temp == (int)Math.pow(2, i))
                return i;
        }
        return -1;
    }

    public static void setArray(int x,int y, int h){

        if(h==3){
            arr[x][y] = 1;
            arr[x-1][y+1] = 1;
            arr[x-2][y+2] = 1;
            arr[x-1][y+2] = 1;
            arr[x][y+2] = 1;
            arr[x+1][y+2] = 1;
            arr[x+2][y+2] = 1;
            arr[x+1][y+1] = 1;
            return;
        } else{
            setArray(x-h/2, y+h/2,h/2);
            setArray(x+h/2, y+h/2, h/2);
            setArray(x, y,h/2);
        }
        return;
    }

    public static void drawStar() {
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if(arr[j][i] == 1) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}