package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Code_2667 {
    static boolean[][] visit;
    static boolean[][] a;
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static final int dx[] = {-1, 1, 0, 0};
    static final int dy[] = {0, 0, -1, 1};

    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        a = new boolean[N+1][N+1];
        visit = new boolean[N+1][N+1];

        for(int i=1; i<=N; i++){
            String str = br.readLine();
            for(int j=1; j<=N; j++){
                a[i][j] = (str.charAt(j-1) == '1');
            }
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if (a[i][j] && !visit[i][j]){
                    int size = BFS(i,j,N); // 단지 크기
                    list.add(size);
                }
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for (int x : list) sb.append(x).append("\n");
        System.out.print(sb);
    }

    private static int BFS(int sx, int sy, int N){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        visit[sx][sy] = true;
        q.add(new int[]{sx, sy});

       int size = 1; // 시작 집 포함

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int dir = 0; dir < 4; dir++){
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 1 || ny < 1 || nx > N || ny > N) continue;
                if (!a[nx][ny] || visit[nx][ny]) continue;

                visit[nx][ny] = true;
                q.add(new int[]{nx, ny});
                size++; // 집 카운팅
            }
        }
        return size;
    }
}
