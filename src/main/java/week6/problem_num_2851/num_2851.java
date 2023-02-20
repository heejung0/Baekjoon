package week6.problem_num_2851;

import java.util.Scanner;

public class num_2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, result = 0;

        for (int i = 0; i <10 ; i++) {
            sum += sc.nextInt();
            // 100과 sum의 차이가 100과 result의 차이보다 작다면 result = sum으로 갱신
            if (Math.abs(100 - sum) < Math.abs(100 - result)) {
                result = sum;
            } else if (Math.abs(100 - sum) == Math.abs(100 - result)) { // 100과 sum, result 사이의 차이가 같다면 더 큰값으로 설정
                if (sum >= result) {
                    result = sum;
                } else {
                    result = result;
                }
            }
        }
        System.out.println(result);
    }
}
