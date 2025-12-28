package week1;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Code_11650{
    static class point{
        int x, y;
        point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Point[] p = new Point[n];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            p[i] = new Point(x, y);
        }

        Arrays.sort(p, (p1, p2) -> {
            if(p1.x != p2.x) return p1.x - p2.x;
            return p1.y - p2.y;
        });

        StringBuilder sb = new StringBuilder();
        for(Point a : p){
            sb.append(a.x).append(' ').append(a.y).append("\n");
        }
        System.out.print(sb);
    }
}