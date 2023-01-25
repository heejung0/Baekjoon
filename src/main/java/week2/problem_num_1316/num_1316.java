package week2.problem_num_1316;

import java.util.Scanner;

public class num_1316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no_group_word = 0;
        int word_num = sc.nextInt();
        String[] words = new String[word_num];

        for (int i = 0; i < word_num; i++) {
            words[i] = sc.next();
        }
        for(int i = 0; i < word_num; i++) {
            for(int j = 0; j < words[i].length() - 1; j++) {
                if (j == 0 && words[i].charAt(j) != words[i].charAt(j+1)){
                    for (int k = j + 1; k < words[i].length(); k++) {
                        if ((words[i].charAt(j) == words[i].charAt(k))) {
                            no_group_word += 1;
                            break;
                        }
                    }
                }
                else if ((words[i].charAt(j) != words[i].charAt(j+1)) && (words[i].charAt(j) != words[i].charAt(j-1))) {
                    for (int k = j + 1; k < words[i].length(); k++) {
                        if ((words[i].charAt(j) == words[i].charAt(k))) {
                            no_group_word += 1;
                            break;
                        }
                    }
                }
                break;
            }
        }

        System.out.println(word_num - no_group_word);

    }
}
