package week5.problem_num_2566;

import java.util.Scanner;

public class num_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] table = new int[9][9];
        int max = 0, row = 0, col = 0;

        // 입력되는 수마다 행렬식에 저장
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 ; j++) {
                table[i][j] = sc.nextInt();
                if (table[i][j] > max) {
                    max = table[i][j]; // 최댓값 비교
                    // 행렬은 1부터 시작하기 때문에 +1씩 해줌
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}