package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] query = new int[T];
        int maxN = 0;

        for (int i = 0; i < T; i++){
            query[i] = Integer.parseInt(br.readLine());
            if (query[i] > maxN) maxN = query[i];
        }

        long[] dp = new long[Math.max(6, maxN+1)];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for (int i = 6; i <= maxN; i++){
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        for (int i = 0; i < T; i++){
            sb.append(dp[query[i]]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
