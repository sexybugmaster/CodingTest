package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] ns = new int[T];
        int maxN = 0;

        for (int i = 0; i < T; i++) {
            ns[i] = Integer.parseInt(br.readLine());
            maxN = Math.max(maxN, ns[i]);
        }

        int[] dp = new int[Math.max(4, maxN + 1)];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= maxN; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int n : ns){
            sb.append(dp[n]).append("\n");
        }

        System.out.print(sb.toString());
    }


}
