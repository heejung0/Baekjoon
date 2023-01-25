package week2.problem_num_1929;

import java.util.Scanner;

public class num_1929 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int[] prime = new int[max + 1];

        for (int i = 0; i < max + 1; i++) {
           prime[i] = i;
        }

        for (int i = min; i < max + 1; i++) {
            if (i >= 2) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime[i] = 0;
                        break;
                    }
                }
            }
        }

        for (int i = min; i < max + 1; i++) {
            if (prime[i] != 0) {
                System.out.println(prime[i]);
            }
        }

    }
}
