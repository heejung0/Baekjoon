package week7.problem_num_5671;

import java.util.Scanner;

// 공백 입력될 시 종료되는 방법 미구현
public class num_5671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int same = 0;

            // 입력된 수 안에서 반복문
            for (int i = min; i < max + 1; i++) {
                String s = Integer.toString(i); // int to String 변환
                for (int j = 0; j < s.length(); j++) {
                    for (int k = j + 1; k < s.length(); k++) {
                        if (s.charAt(j) == s.charAt(k)) {
                            same += 1; // 같은 수가 있을 시 +1
                        }
                    }
                }
            }

            int result = max - min - same + 1;
            if (result <= 0) {
                System.out.println(0);
            }
            else {
                System.out.println(result);
            }

            same = 0;
        }
    }
}


// Buffered를 사용한 답
/*
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            String str1[] = str.split(" ");
            int N = Integer.parseInt(str1[0]);
            int M = Integer.parseInt(str1[1]);
            int cnt = 0;
            for (int i = N; i <= M; i++) {
                int arr[] = new int[10];
                String temp = String.valueOf(i);
                int check = 1;
                for (int j = 0; j < temp.length(); j++) {
                    arr[temp.charAt(j) - '0']++;
                    if (arr[temp.charAt(j) - '0'] != 1) check = 0;
                }
                cnt += check;
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
    }
}*/
