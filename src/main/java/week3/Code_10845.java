package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Code_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> Queue = new ArrayDeque<>();


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            switch(cmd){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    Queue.offer(num);
                    break;

                case "pop":
                   if(Queue.isEmpty()){
                       sb.append("-1").append("\n");
                   }
                   else sb.append(Queue.poll()).append("\n");
                   break;

                case "size":
                    sb.append(Queue.size()).append("\n");
                    break;

                case "empty":
                    if(Queue.isEmpty()){
                        sb.append("1").append("\n");
                    }
                    else{
                        sb.append("0").append("\n");
                    }
                    break;

                case "front":
                    if(Queue.isEmpty()){
                        sb.append("-1").append("\n");
                    }
                    else{
                        sb.append(Queue.peekFirst()).append("\n");
                    }
                    break;

                case "back":
                    if(Queue.isEmpty()){
                        sb.append("-1").append("\n");
                    }
                    else{
                        sb.append(Queue.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}
