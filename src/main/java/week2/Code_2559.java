package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_2559 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] s = new long[N+1];
        long[] k = new long[N-M+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i<=N; i++){
            s[i] = s[i-1] + Long.parseLong(st.nextToken());
        }
        for (int i = 0; i<N-M+1; i++){
            k[i] = s[i+M]-s[i];
        }
        Arrays.sort(k);
        System.out.println(k[k.length-1]);

    }
}
