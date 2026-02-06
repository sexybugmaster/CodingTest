package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_1697 {
    static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N >= K){
            System.out.println(N - K);
            return;
        }

        System.out.println(BFS(N, K));

    }

    private static int BFS(int start, int target){
        int[] dist = new int[MAX + 1];
        Arrays.fill(dist, -1);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(start);
        dist[start] = 0;

        while (!q.isEmpty()){
            int cur = q.poll();

            if (cur == target) return dist[cur];

            int next1 = cur - 1;
            int next2 = cur + 1;
            int next3 = cur * 2;

            // cur - 1
            if (next1 >= 0 && next1 <= MAX && dist[next1] == -1){
                dist[next1] = dist[cur] + 1;
                q.add(next1);
            }

            // cur + 1
            if (next2 >= 0 && next2 <= MAX && dist[next2] == -1){
                dist[next2] = dist[cur] + 1;
                q.add(next2);
            }

            // cur * 2
            if (next3 >= 0 && next3 <= MAX && dist[next3] == -1){
                dist[next3] = dist[cur] + 1;
                q.add(next3);
            }
        }

        return -1;
    }
}
