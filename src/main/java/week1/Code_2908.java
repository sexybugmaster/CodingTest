package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Code_2908{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 = st.nextToken();
        String num2 = st.nextToken();
        String num = "";

        for (int i = 2; i>=0; i--) {
            if (num1.charAt(i)!=num2.charAt(i)) {
                if(Integer.parseInt(String.valueOf(num1.charAt(i)))>Integer.parseInt(String.valueOf(num2.charAt(i)))){
                    num = num1;
                    break;
                }
                else {
                    num = num2;
                    break;
                }
            }
            }
        for (int j = 2; j>=0; j--) {
            System.out.print(num.charAt(j));
        }

    }
}