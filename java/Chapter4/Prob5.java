package Baekjoon.Chapter4;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-10.
 *
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
 * 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 각 케이스마다 한줄씩 평균을 넘는 학생들의 비율을 소수점 넷째자리에서 반올림하여 출력한다.
 */
public class Prob5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int C = s.nextInt();
        int N;
        int sum, avg, count;
        //int temp;

        for (int i = 0; i < C; i++) {
            sum = 0;
            count = 0;
            N = s.nextInt();
            int[] tempArr = new int[N];

            for (int j = 0; j < N; j++) {
                tempArr[j] = s.nextInt();
                sum += tempArr[j];
            }

            avg = sum / N;
            for (int j = 0; j < N; j++) {
                if (tempArr[j] > avg) {
                    count++;                // 평균보다 높은 학생의 수를 구함
                }
            }

            System.out.printf("%.3f%%", (double) count / N * 100);

            // 정수 형태에서 반올림 직접 구현
//            temp = (count * 1000000 / N);   // count/N (비율) * 1000000을 함
//            temp += 5;                      // 반올림을 위해 5를더함
//            temp /= 10;         // 정수형 변수에서10으로 나누어 반올림한 자리 뒤를 자름
//
//            System.out.println(temp / 1000.0 + "%");  //소수점 표현을위해 1000으로 나누며 실수형으로 변환
        }
    }
}
