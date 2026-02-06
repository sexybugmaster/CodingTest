package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Code_2606 {
    static boolean[]visited;
    static ArrayList<Integer> arr[];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int com_num = Integer.parseInt(br.readLine());
        int net_num = Integer.parseInt(br.readLine());
        arr = new ArrayList[com_num+1];

        for (int i = 1; i <= com_num; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        // 연결리스트 만들기
        StringTokenizer st;
        for (int j = 1; j <= net_num; j++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x].add(y);
            arr[y].add(x);
        }

        visited = new boolean[com_num + 1];
        BFS(1);

        System.out.print(count);
    }

    private static void BFS(int node) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(node);
        visited[node] = true;

        while (!q.isEmpty()) {
            int now_Node = q.poll();
            for(int i : arr[now_Node]) {
                if(!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    count++;
                }
            }
        }
    }
}
