package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int best = 0;
        int lo = 0;
        int hi = arr[N - 1];

        while(lo <= hi){
            int mid = (lo + hi) / 2;
            long sum = 0;
            for(int i = 0; i < N; i++){
                if(arr[i]>mid){
                    sum+=(arr[i] - mid);
                }
            }
            if(sum>=M){
                best = mid;
                lo = mid + 1;
            }else {
                hi = mid - 1;
            }
        }
        System.out.print(best);
    }
}
