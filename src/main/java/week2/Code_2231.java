package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_2231 {
    static int start;
    static int N;
    static int step;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int N2 = N;
        step = 0;

        while(N2>0){
            N2/=10;
            step++; // 자릿수
        }

        start = Math.max(1, N - 9*step); //N에서 최대 자리수합을 뺀 값

        System.out.print(sum_step(N, start));
    }

    public static int sum_step(int x, int start){
        for(int i=start;i<=N;i++){
            int sum = 0;
            int temp = i;
            while(temp>0) {
                sum = sum + temp % 10;
                temp /= 10;
            }
            if (i + sum == x)
                return i;
        }
        return 0;
    }
}
