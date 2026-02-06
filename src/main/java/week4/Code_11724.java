package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Code_11724 {
    static int N, M;
    static ArrayList<Integer> adj[];
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <=N; i++) adj[i] =new ArrayList<>();

        for (int i = 0; i <M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }

        int cnt = 0;

        for (int i = 1; i <=N; i++){
            if (!visited[i]){
                cnt++;
                bfs(i);
            }
        }

        System.out.println(cnt);
    }

    private static void bfs(int start) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()){
            int cur = queue.poll();

            for (int next : adj[cur]){
                if (!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
