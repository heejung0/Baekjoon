package week4.problem_num_1032;

import java.util.Scanner;

public class num_1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int file_num = sc.nextInt(); // 파일 개수
        String[] file_name = new String[file_num - 1];

        char[] char_name = sc.next().toCharArray(); // 첫번째 파일 이름을 문자형 배열로 변환

        for (int i = 0; i < file_num - 1; i++) {
            file_name[i] = sc.next();
        }

        // 첫번째 파일 이름을 기준으로 다르면 ?로 치환
        for (int i = 0; i < file_num - 1; i++) {
            for (int j = 0; j < char_name.length; j++) {
                if (char_name[j] != file_name[i].charAt(j)) {
                    char_name[j] = '?';
                }
            }
        }

        String pattern = String.valueOf(char_name); // 문자형 배열로 저장했던 첫번째 파일 이름을 문자열로 변환

        System.out.println(pattern);
    }
}
