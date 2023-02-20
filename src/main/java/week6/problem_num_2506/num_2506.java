package week6.problem_num_2506;

import java.util.Scanner;

public class num_2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, result = 0;

        for (int i = 0; i < num; i++) {
            if (sc.nextInt() == 1) {
                sum += 1; // 연속 정답일 경우 가산점 체크
                result += sum;
            }
            else {
                sum = 0; // 오답이 있을 경우 0으로 초기화
            }
        }

        System.out.println(result);
    }
}
