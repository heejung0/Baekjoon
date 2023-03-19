package week7.problem_num_2857;

import java.util.Scanner;

public class num_2857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notFbi = 0; // FBI가 아닌 사람의 수

        for(int i = 0; i < 5; i++) {
            if(sc.next().contains("FBI")) {
                System.out.print(i + 1 + " ");
            }
            else {
                notFbi += 1;
            }
        }
        if (notFbi == 5) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
