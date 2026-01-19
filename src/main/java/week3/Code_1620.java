package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Code_1620 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] name = new String[N+1];
        for (int i=1;i<=N;i++){
            String poket = br.readLine();
            map.put(poket,i);
            name[i] = poket;
        }

        for (int i=0;i<M;i++) {
            String ans = br.readLine();
            char c = ans.charAt(0);
            if (c >= '0' && c <= '9') {
                int idx = Integer.parseInt(ans);
                sb.append(name[idx]).append("\n");
            } else {
                sb.append(map.get(ans)).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
