package practice_problem_04;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int[] freq = new int[26];
        for(int i = 0; i < st.length(); i++){
            freq[st.charAt(i) - 'a'] ++ ;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                char c = (char)('a' + i);
                System.out.println(c + " : "  + freq[i]);
            }
        }
    }
}
