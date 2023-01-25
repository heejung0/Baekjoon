package week2.problem_num_2675;

import java.util.Scanner;

public class num_2675 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test_num = sc.nextInt();
        int[] repeat = new int[test_num];
        String[] string = new String[test_num];

        for (int i = 0; i < test_num; i++) {
            repeat[i] = sc.nextInt();
            string[i] = sc.next();
        }

        for (int i = 0; i < test_num; i++) {
            for (int j = 0; j < string[i].length(); j++) {
                for (int k =0; k < repeat[i]; k++) {
                    System.out.print(string[i].charAt(j));
                }
            }
            System.out.println();
        }

    }
}
