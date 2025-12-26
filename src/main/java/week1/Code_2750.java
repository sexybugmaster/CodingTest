package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Code_2750{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num[] = new int[1000];
        int num2[];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        num2=Arrays.copyOfRange(num,0,n);
        Arrays.sort(num2);

        for (int i = 0; i < n; i++)
            System.out.println(num2[i]);
    }
}