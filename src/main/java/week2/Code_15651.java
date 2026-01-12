package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_15651 {
    static int N, M;
    static int[] s;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        s = new int[M];
        backtracking(0);

        System.out.println(sb.toString());
    }

    private static void backtracking(int length) {
        if(length == M){
            for (int i = 0; i < M; i++)
                sb.append(s[i]).append(" ");
            sb.append("\n");
            return;
        }

        for(int x = 1; x <= N; x++){
            s[length]=x;
            backtracking(length+1);
        }
    }
}
