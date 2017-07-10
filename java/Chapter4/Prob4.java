package Baekjoon.Chapter4;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-10.
 *
 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
 * 일단 세준이는 자기 점수 중에 최대값을 골랐다. 이 값을 M이라고 한다.
 * 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 */
public class Prob4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum = 0;
        int[] score = new int[N];
        double avg;

        for (int i = 0; i < N; i++) {
            score[i] = s.nextInt();
            sum += score[i];
        }
        avg = sum/(double)maxArr(score)/N * 100;    //각점수를 변환하는것과 평균자체를 변환하는것이 같음
        System.out.printf("%.2f",avg);
    }

    public static int maxArr(int[] arr){
        int len = arr.length;
        int count;

        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = 0; j < len; j++) {
                if(arr[i] >= arr[j]) count++;
            }
            if(count == len) return arr[i];
        }
        return -1;
    }
}
