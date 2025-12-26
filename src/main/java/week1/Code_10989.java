package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Code_10989{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());

        int[] num = new int[10001];

        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            num[x]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            while (num[i]-- > 0){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb.toString());

    }
}