package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0;
        long sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            sum += arr[i];

            while(sum >= S){
                ans = Math.min(ans, i - l + 1);
                sum -= arr[l++];
            }
        }
        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
    }
}
