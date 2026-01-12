package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_1436 {
    static int count=0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int num = 665;
        while(true){
            if(String.valueOf(num).contains("666")){
                count++;
                if(count==N){
                    System.out.print(num);
                    return;
                }
            }
            num++;
        }
    }
}
