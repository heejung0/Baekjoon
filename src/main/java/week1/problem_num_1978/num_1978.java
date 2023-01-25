package week1.problem_num_1978;

import java.util.Scanner;

public class num_1978 {
    public static void main(String[] args) {

        System.out.print("0 이상 20 이하의 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));

    }

    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}