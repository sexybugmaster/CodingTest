package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_15649 {

    static int N, M;
    static boolean[] v;
    static int[] s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        s = new int[N];

        backtraking(0); // 현재 포함된 수열
    }

    private static void backtraking(int length) {
        //정답인지 확인해서 return;
        if(length == M){
            // 수열 출력
            printArray();
            return;
        }
        // 갈수 있는 모든 선택지, 방문 여부
        for(int i = 0; i<N; i++){
            if(!v[i]){
                v[i] = true; // 방문함
                s[length] = i;
                backtraking(length+1);
                v[i] = false;
            }
        }
    }

    private static void printArray() {
        for(int i = 0; i<M; i++){
            System.out.print(s[i]+1+" ");
        }
        System.out.println();
    }
}
