package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Code_2178 {
    static boolean visited[][];
    static boolean way[][];
    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, -1, 1};
    static int M, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        way = new boolean[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String arr = br.readLine();
            for (int j = 0; j < M; j++) {
                if (arr.charAt(j) == '1') {
                    way[i][j] = true;
                }else{
                    way[i][j] = false;
                }
            }
        }

        System.out.print((BFS(0,0)));
    }

    private static int BFS(int a, int b) {
        int[][] dist = new int[N][M];
        ArrayDeque<int[]> q = new ArrayDeque<>();

        visited[a][b] = true;
        dist[a][b] = 1; // 시작 칸 포함
        q.add(new int[]{a, b});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (!way[nx][ny]) continue;
                if (visited[nx][ny]) continue;

                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
                q.add(new int[]{nx, ny});
            }
        }

        return dist[N - 1][M - 1];
    }
}
