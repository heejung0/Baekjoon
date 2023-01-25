package week1.problem_num_20115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class num_20115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int drink_num = sc.nextInt();
        Integer[] drink = new Integer[drink_num];
        double total_drink = 0.0;

        for (int i = 0; i < drink_num; i++) {
            int num = sc.nextInt();
            drink[i] = num;
        }

        Arrays.sort(drink, Collections.reverseOrder());

        for (int i = 0; i < drink_num - 1; i++) {
            if (i == 0 && (drink[i] <= drink[i+1])) {
                total_drink = drink[i+1] + ((double)drink[i]/2);
            }
            else if (i == 0 && (drink[i] >= drink[i+1])) {
                total_drink = drink[i] + ((double)drink[i+1]/2);
            }
            else {
                if(total_drink <= drink[i+1]) {
                    total_drink = drink[i+1] + ((double)total_drink/2);
                }
                else {
                    total_drink = total_drink + ((double)drink[i+1]/2);
                }
            }
        }

        System.out.println(total_drink);
    }

}