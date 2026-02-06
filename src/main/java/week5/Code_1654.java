package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] line = new int[K];
        int L = N - K;

        for(int i = 0; i < K; i++){
            line[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(line);

        long lo = 1;
        long hi = line[line.length - 1];
        long mid, ans = 0;

        while(lo <= hi){
            mid = (lo + hi) / 2;

            int cnt = 0;
            for(int i = 0; i < line.length; i++){
                cnt += line[i]/mid;
            }

            if(cnt >= N){
                ans = mid;
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        System.out.print(ans);
    }
}
