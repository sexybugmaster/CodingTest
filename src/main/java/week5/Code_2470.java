package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_2470 {
    static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
           arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int lo = 0;
        int hi = N - 1;
        ArrayDeque<Integer> q = new ArrayDeque<>();

        long ans = Long.MAX_VALUE;
        while(lo < hi){
            long sum = (long) arr[lo] + arr[hi];

            if(Math.abs(sum) < ans){
                ans = Math.abs(sum);
                q.add(arr[lo]);
                q.add(arr[hi]);
            }

            if(sum < 0)
                lo++;
            else if(sum > 0)
                hi--;
            else
                break;
        }

        System.out.print(q.pollFirst() + " " + q.pollLast());
    }
}
