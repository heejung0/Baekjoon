package week6.problem_num_2139;

import java.util.Scanner;

public class num_2139 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int total_date = date(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (total_date == 0) { // 0 0 0이 입력되었을 경우 종료
                break;
            } else {
                System.out.println(total_date);
            }
        }
    }

    // 날짜 계산하는 메소드
    public static int date(int day, int month, int year) {
        int result = 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 달 별 날짜 배열 선언

        // 0 0 0이 입력되었을 경우와 윤달 예외처리
        if (year == 0 && month == 0 && day == 0) {
            return 0;
        } else if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            days[1] = 29;
        }

        // 날짜 계산
        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }
        result += day;

        return result;
    }
}
