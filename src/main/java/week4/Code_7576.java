package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Code_7576 {
    static int M, N;
    static int tomato[][];
    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, -1, 1};

    static class Node {
        int x, y;
        Node(int x, int y) {this.x = x; this.y = y;}
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        tomato = new int[N][M];
        ArrayDeque<Node> q = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if (tomato[i][j] == 1) q.add(new Node(i, j));
            }
        }

        // BFS
        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                // 안 익은 토마토만 퍼뜨림
                if (tomato[nx][ny] == 0){
                    tomato[nx][ny] = tomato[cur.x][cur.y] + 1; // 날짜 누적
                    q.add(new Node(nx, ny));
                }
            }
        }

        // 결과 계산
        int maxDay = 1;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (tomato[i][j] == 0){ // 끝까지 안 익은 게 있으면
                    System.out.println(-1);
                    return;
                }
                maxDay = Math.max(maxDay, tomato[i][j]);
            }
        }

        // 처음 익은 토마토가 1부터 시작했으니 -1
        System.out.println(maxDay - 1);
    }
}
