package week2.problem_num_1152;

import java.util.Scanner;

public class num_1152 {
    public static void main(String[] args){

        System.out.print("문자열을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] count = string.split(" ");

        System.out.println("입력한 문자열을 구성하는 단어의 개수 : " + count.length);

    }
}
