package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S_num = Integer.parseInt(st.nextToken());
        int winSize = Integer.parseInt(st.nextToken());
        int count = 0;

        String S = br.readLine();

        int[] P = new int[4]; // A, C, G, T 최소 개수
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        int[] count_check = new int[4]; // 현재 윈도우의 A,C,G,T 개수

        // 1) 초기 윈도우(0 ~ winSize-1) 세팅
        for (int i = 0; i < winSize; i++) {
            switch (S.charAt(i)) {
                case 'A': count_check[0]++; break;
                case 'C': count_check[1]++; break;
                case 'G': count_check[2]++; break;
                case 'T': count_check[3]++; break;
            }
        }

        // 초기 윈도우 검사
        if (count_check[0] >= P[0] &&
                count_check[1] >= P[1] &&
                count_check[2] >= P[2] &&
                count_check[3] >= P[3]) {
            count++;
        }

        // 2) 슬라이딩: 오른쪽 1개 추가, 왼쪽 1개 제거
        for (int r = winSize; r < S_num; r++) {
            int l = r - winSize; // 윈도우에서 빠질 왼쪽 인덱스

            // 왼쪽 문자 제거
            switch (S.charAt(l)) {
                case 'A': count_check[0]--; break;
                case 'C': count_check[1]--; break;
                case 'G': count_check[2]--; break;
                case 'T': count_check[3]--; break;
            }

            // 오른쪽 문자 추가
            switch (S.charAt(r)) {
                case 'A': count_check[0]++; break;
                case 'C': count_check[1]++; break;
                case 'G': count_check[2]++; break;
                case 'T': count_check[3]++; break;
            }

            // 매 이동마다 검사
            if (count_check[0] >= P[0] &&
                    count_check[1] >= P[1] &&
                    count_check[2] >= P[2] &&
                    count_check[3] >= P[3]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
