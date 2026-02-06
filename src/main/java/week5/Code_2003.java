package week5;

import java.io.*;
import java.util.*;

public class Code_2003 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());   // <- 수열 줄 다시 읽기!
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        int lo = 0, hi = 0;
        int sum = 0, count = 0;

        while (true) {
            if (sum >= M) {
                if (sum == M) count++;
                sum -= A[lo++];
            } else {
                if (hi == N) break;
                sum += A[hi++];
            }
        }

        System.out.println(count);
    }
}
