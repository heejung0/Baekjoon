package week5.problem_num_10989;

import java.util.Arrays;
import java.util.Scanner;

public class num_10989 {
    public static void main(String[] args) {
        //되긴 하지만 시간제한에 걸림 => 아래의 BufferedReader 사용
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for (int i = 0; i < num; i++) {
            System.out.println(array[i]);
        }
    }
}

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) throws NumberFormatException, IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N = Integer.parseInt(br.readLine());
//        int[] array = new int[N];
//
//        for(int i = 0 ; i < N ; i++) {
//            array[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(array);
//
//        for(int i = 0 ; i < N ; i++) {
//            bw.write(String.valueOf(array[i]) + "\n");
//        }
//
//        br.close();
//        bw.flush();
//        bw.close();
//    }
//}
