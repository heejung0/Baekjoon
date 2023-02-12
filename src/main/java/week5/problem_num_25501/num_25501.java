package week5.problem_num_25501;

import java.util.Scanner;

public class num_25501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_num = sc.nextInt();
        int[] count = new int[test_num];

        for (int i = 0; i < test_num; i++) {
            System.out.println(isPalindrome(sc.next(), count, i) + " " + count[i]);
        }
    }

    // 재귀 및 회귀회수 판단하는 메서드
    public static int recursion(String s, int l, int r, int[] count, int i) {

        if (l >= r) {
            count[i] += 1;
            return 1;
        }
        else if (s.charAt(l) != s.charAt(r)) {
            count[i] += 1;
            return 0;
        }
        else {
            count[i] += 1;
            return recursion(s, l+1, r-1, count, i);
        }
    }

    // Palindrome인지 판단하는 메서드
    public static int isPalindrome(String s, int[] count, int i) {
        return recursion(s, 0, s.length()-1, count, i);
    }
}
