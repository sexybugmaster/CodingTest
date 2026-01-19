package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Code_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            String str = br.readLine().trim();

            boolean ok = true;

            for (char c : str.toCharArray()) {
                if (c == '(')
                    stack.push(c);
                else if (c == ')')
                    if (stack.isEmpty() == true) {
                        ok = false;
                        break;
                    } else
                        stack.pop();
            }

            if (!stack.isEmpty())
                ok = false;

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
