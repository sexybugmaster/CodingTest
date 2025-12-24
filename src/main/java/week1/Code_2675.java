package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                for (int m = 0; m < k; m++){
                    sb.append(c);
                }
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}