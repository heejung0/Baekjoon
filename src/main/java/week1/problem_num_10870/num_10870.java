package week1.problem_num_10870;

import java.util.Scanner;

public class num_10870{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime_check = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            prime_check[i] = num;
        }

        int prime = n;
        for (int i = 0; i < n; i++) {

            if (prime_check[i] == 1) {
                prime--;
            }
            for (int j = 2; j < prime_check[i]; j++) {
                if (prime_check[i] % j == 0) {
                    prime--;
                    break;
                }
            }
        }
        System.out.println(prime);
    }
}