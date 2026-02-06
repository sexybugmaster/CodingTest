package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code_1260 {
    static boolean visited[];
    static ArrayList<Integer>A[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        A = new ArrayList[N+1];

        for(int i=1; i<=N; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(A[i]); // 엣지 오름차순 정렬
        }

        visited = new boolean[N+1];
        DFS(start);
        System.out.println();

        visited = new boolean[N+1];
        BFS(start);
        System.out.println();
    }

    private static void BFS(int Node    ) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(Node);
        visited[Node] = true;

        while(!q.isEmpty()){
            int now_Node = q.poll();
            System.out.print(now_Node + " ");
            for(int i: A[now_Node]){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    private static void DFS(int Node) {
        System.out.print(Node + " ");
        visited[Node] = true;
        for(int i: A[Node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
