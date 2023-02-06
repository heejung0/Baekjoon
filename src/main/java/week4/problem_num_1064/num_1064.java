package week4.problem_num_1064;

import java.util.Scanner;

import static java.lang.Math.*;

public class num_1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // hypot(a, b)는 a와 b를 높이, 너비로 하는 빗변의 길이를 구해주는 함수
        double a = hypot(x[1]-x[2],y[1]-y[2]);
        double b = hypot(x[2]-x[0],y[2]-y[0]);
        double c = hypot(x[0]-x[1],y[0]-y[1]);

        // 둘 이상의 점이 겹치거나, 세 점이 한 직선 위에 있으면 (= 기울기가 같으면) 사각형을 만들 수 없음
        if ((x[1]-x[0])*(y[2]-y[0]) == (y[1]-y[0])*(x[2]-x[0])) { // 기울기가 같을 때(CCW) https://www.acmicpc.net/blog/view/27
            System.out.println(-1);
        }
        else {
            System.out.println((max(a,max(b,c)) - min(a,min(b,c))) * 2);
        }
    }
}
