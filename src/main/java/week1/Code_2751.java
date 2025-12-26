package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

class Code_2751{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(java.lang.System.in));
        LinkedList<Integer> num = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }

        Integer[] num2 = num.toArray(new Integer[0]);
        Arrays.sort(num2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(num2[i]).append("\n");
        }
        System.out.print(sb.toString());
    }
}