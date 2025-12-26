package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Code_10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int index = 0;
        int[] alpa = new int[26];
        Arrays.fill(alpa, -1);

        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            if (alpa[index] == -1)
                alpa[index] = i;
        }
        for (int i = 0; i < 26; i++)
            System.out.print(alpa[i]+" ");
    }
}