package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_2110 {
    static int[] house;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        house = new int[N];
        int MAX = 0;

        for(int i=0;i<N;i++){
            house[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(house);

        int lo = 1; // 최소거리
        int hi = house[N-1] - house[0]; // 최대거리
        int ans = 0;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(canInstall(mid, N, C)){
                ans = mid;
                lo = mid+1; // 더 큰 거리 시도
            }else{
                hi = mid - 1; // 거리 줄이기
            }
        }
        System.out.println(ans);
    }

    private static boolean canInstall(int dist, int N, int C) {
        int cnt = 1;
        int last = house[0];

        for(int i = 1; i<N; i++){
            if (house[i] - last >= dist){
                cnt++;
                last = house[i];
            }
        }
        return cnt >= C;
    }
}
