package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Code_1316{
   public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int count = 0;

       for (int i = 0; i < n; i++) {
           String s = br.readLine();
           boolean[] seen = new boolean[26];
           boolean ok = true;

           char prev = 0;
           for (int j = 0; j < s.length(); j++) {
               char cur = s.charAt(j);
               if (cur != prev){ // 현재 글자가 이전 글자와 같으면 패스
                   if (seen[cur - 'a']){ // 이전에 나왔던 글자면
                       ok = false;
                       break;
                   }
                   seen[cur - 'a'] = true; // 이전에 안 나왔던 글자
                   prev = cur;
               }
           }
           if (ok) count++;
       }
       System.out.println(count);
   }
}