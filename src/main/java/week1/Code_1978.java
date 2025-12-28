package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Code_1978{
    static boolean isPrime(int n){
        if (n<2) return false;
        if (n==2) return true;
        if (n%2==0) return false;
        for (int i=3; i*i<=n; i+=2){
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i =0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());
            if (isPrime(x)) count++;
        }
        System.out.println(count);
    }
}