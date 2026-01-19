package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Code_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int K = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < K; i++) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0)
                stack.pop();
            else
                stack.push(N);
        }

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
