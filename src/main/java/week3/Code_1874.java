package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Code_1874 {
    static StringBuilder sb = new StringBuilder();
    static ArrayDeque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int next = 1;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (next <= num) {
                    push(next++);
            }
            if (stack.isEmpty()||stack.peek()!=num){
                System.out.println("NO");
                return;
            }
            pop();
        }

        System.out.print(sb.toString());
    }

    public static void push(int m){
        stack.push(m);
        sb.append("+").append("\n");
    }
    public static void pop(){
        if(!stack.isEmpty()){
            stack.pop();
            sb.append("-").append("\n");
        }
    }
}
