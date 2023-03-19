package week7.problem_num_14659;

import java.util.Arrays;
import java.util.Scanner;

public class num_14659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bowMan = sc.nextInt();
        int[] height = new int[bowMan];
        int kill = 0, a = 0;
        int[] kills = new int[bowMan];

        for(int i = 0; i < bowMan; i++) {
            height[i] = sc.nextInt();
        }

        for(int i = 0; i < bowMan - 1; i++) {
            if(height[i] > height[i + 1]) {
                for(int j = i; j < bowMan - 1; j++) {
                    if(height[i] > height[j + 1]) {
                        kill += 1;
                    }
                    else {
                        kills[a] = kill;
                        a += 1;
                        break;
                    }
                }
            }
            else {
                kill = 0;
            }
        }

        Arrays.sort(kills);

        System.out.println(kills[bowMan - 1]);
    }
}

/*
import java.util.Scanner;

public class Main {

    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 활잡이의 수
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) { // 자신보다 높은 봉우리면 킬
                    count++;
                } else { // 자신보다 낮은 봉우리면 포기
                    break;
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}
 */
