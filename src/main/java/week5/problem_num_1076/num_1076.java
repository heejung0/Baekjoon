package week5.problem_num_1076;

import java.util.Scanner;

public class num_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] value = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        long[] multiple = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        String first_value = sc.next();
        String second_value = sc.next();
        String multiple_value = sc.next();

        long result = (value[index(first_value)] * 10 + value[index(second_value)])* multiple[index(multiple_value)];

        System.out.println(result);
    }

    public static int index(String s) {
        switch (s) {
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;
            case "violet":
                return 7;
            case "grey":
                return 8;
            case "white":
                return 9;
        }
        return -1;
    }
}
