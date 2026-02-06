package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_1920 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
           A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < M; j++){
            int lo = 0;
            int hi = N-1;
            boolean flag = false;

            int num = Integer.parseInt(st.nextToken());
            while(lo<=hi){
                int mid = (lo + hi) / 2;
                if(A[mid] > num){
                    hi = mid - 1;
                }else if(A[mid] < num){
                    lo = mid + 1;
                }
                if(A[mid] == num){
                    flag = true;
                    break;
                }
            }
            sb.append(flag? 1:0).append("\n");
        }

        System.out.print(sb.toString());
    }
}
