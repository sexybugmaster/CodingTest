package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int arr_N[] = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr_N[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr_N);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int num = Integer.parseInt(st.nextToken());
            int cnt = upperBound(arr_N, num) - lowerBound(arr_N, num);
            sb.append(cnt).append(" ");
            
        }

        System.out.println(sb.toString());
    }

    private static int lowerBound(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;
        while(lo<hi){
            int mid = (lo + hi)/2;
            if (arr[mid] >= target)
                hi = mid;
            else
                lo = mid+1;
        }
        return lo;
    }

    private static int upperBound(int[] arr, int target) {
       int lo = 0;
       int hi = arr.length;
       while(lo<hi){
           int mid = (lo + hi)/2;
           if (arr[mid] > target)
               hi = mid;
           else
               lo = mid+1;
       }
       return lo;
    }


}
