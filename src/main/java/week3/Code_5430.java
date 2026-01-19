package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Code_5430 {
    static ArrayDeque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int Test = Integer.parseInt(br.readLine());

        for(int t = 0; t < Test; t++){
            String cmd = br.readLine();
            int arr_size = Integer.parseInt(br.readLine());
            String arr = br.readLine().trim(); // 예: [1,2,3,4]

            int dCount = 0;
            for (int i = 0; i < cmd.length(); i++){
                if (cmd.charAt(i) == 'D') dCount++;
            }
            if (dCount > arr_size){
                sb.append("error\n");
                continue;
            }

            ArrayDeque<Integer> temp = new ArrayDeque<>();

            String inner = arr.substring(1, arr.length() -1);
            if (!inner.isEmpty()){
                StringTokenizer st = new StringTokenizer(inner, ",");
                while (st.hasMoreTokens()){
                    dq.offer(Integer.parseInt(st.nextToken()));
                }
            }

            boolean rev = false;

            for (int i = 0; i < cmd.length(); i++){
                char c = cmd.charAt(i);
                if (c == 'R'){
                    rev = !rev;
                }else {
                    if(!rev) dq.pollFirst();
                    else dq.pollLast();
                }
            }

            sb.append('[');
            if(!dq.isEmpty()){
                if(!rev){
                    while (!dq.isEmpty()){
                        sb.append(dq.pollFirst());
                        if (!dq.isEmpty()) sb.append(',');
                    }
                }else{
                    while (!dq.isEmpty()){
                        sb.append(dq.pollLast());
                        if (!dq.isEmpty()) sb.append(',');
                    }
                }
            }
            sb.append(']').append('\n');

        }
        System.out.println(sb.toString());
    }
}
