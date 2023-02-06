package week4.problem_num_1212;

import java.util.Scanner;

public class num_1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] format = {"000", "001", "010", "011", "100", "101", "110", "111"}; // 2진수 배열
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            // 첫 숫자가 4 미만일 때
            if (i == 0) {
                if (s.charAt(0) == '0') {
                    System.out.println("0");
                }
                else if (s.charAt(0) == '1') {
                    System.out.print("1");
                }
                else if (s.charAt(0) == '2') {
                    System.out.print("10");
                }
                else if (s.charAt(0) == '3') {
                    System.out.print("11");
                }
                else {
                    System.out.print(format[s.charAt(0) - '0']); // 아스키코드를 이용한 char to int 변환 (0 = 48)
                }
            }
            else {
                System.out.print(format[s.charAt(i) - '0']);
            }
        }
    }
}
