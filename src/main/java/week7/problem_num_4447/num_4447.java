package week7.problem_num_4447;

import java.util.Scanner;

public class num_4447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] heroes = new String[num + 1];
        int good = 0, bad = 0;

        // nextInt() 후 nextLine()을 쓰니 공백을 테스트 케이스의 개수로 입력받음 => 배열의 크기 1 증가 & 좋은놈인지 나쁜놈인지 판단할 때 i = 1부터 시작
        for(int i = 0; i < num + 1; i++) {
            heroes[i] = sc.nextLine();
        }

        for(int i = 1; i < num + 1; i++) {
            for(int j = 0; j < heroes[i].length(); j++) {
                if(heroes[i].charAt(j) == 'g' || heroes[i].charAt(j) == 'G') {
                    good += 1;
                }
                else if (heroes[i].charAt(j) == 'b' || heroes[i].charAt(j) == 'B') {
                    bad += 1;
                }
            }

            if (good > bad) {
                System.out.println(heroes[i] + " is GOOD");
            }
            else if (good < bad) {
                System.out.println(heroes[i] + " is A BADDY");
            }
            else {
                System.out.println(heroes[i] + " is NEUTRAL");
            }

            // g와 b의 수 초기화
            good = 0;
            bad = 0;
        }
    }
}
