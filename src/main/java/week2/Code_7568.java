package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_7568 {
    static int [] height;
    static int [] weight;
    static int [] rank;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        height = new int[N];
        weight = new int[N];

        rank = new int[N];
        Arrays.fill(rank, 1);

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            height[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(height[i]<height[j]&&weight[i]<weight[j])
                    rank[i]++;
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(rank[i]+" ");
        }
    }
}
