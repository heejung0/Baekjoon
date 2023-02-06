package week4.problem_num_1183;

import java.util.Arrays;
import java.util.Scanner;

public class num_1183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int witch = sc.nextInt();
        int[] waiting = new int[witch];

        for (int i = 0; i <witch; i++) {
            waiting[i] = sc.nextInt() - sc.nextInt();
        }

        Arrays.sort(waiting);

        // 마법사가 홀수면 최솟값은 1개, 짝수면 중앙의 두 값을 포함한 사이의 값들 https://v3.leedo.me/devs/58
        if(witch % 2 == 1) {
            System.out.println(1);
        }
        else {
            System.out.println(Math.abs(waiting[witch / 2] - waiting[witch / 2 - 1]) + 1);
        }
    }
}
