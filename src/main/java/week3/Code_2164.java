package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Code_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            queue.addFirst(i);
        }
        for(int i =1; i < N; i++){
            queue.pollLast();
            queue.addFirst(queue.pollLast());
        }
        System.out.print(queue.poll());
    }
}
