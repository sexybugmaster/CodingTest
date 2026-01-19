package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;


public class Code_10828 {
    static ArrayDeque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push":
                    int M = Integer.parseInt(st.nextToken());
                    push(M);
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    System.out.println(top());
            }

        }
    }

    private static int top() {
        if  (empty() == 1)
            return -1;
        else
            return stack.peek();
    }

    private static int empty() {
        if (stack.isEmpty() == false){
            return 0;
        }
        else  {
            return 1;
        }
    }

    private static int size() {
        return stack.size();
    }

    private static int pop() {
        if  (empty() == 1)
            return -1;
        else
            return stack.pop();
    }

    private static void push(int m) {
        stack.push(m);
    }
}
