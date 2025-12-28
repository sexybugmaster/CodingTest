package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Code_11651{
    static class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Point[] points = new Point[n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(x, y);
        }

        Arrays.sort(points, (p1, p2) ->
        {
            if(p1.y != p2.y) return  p1.y - p2.y;
            return  p1.x - p2.x;
        });

        StringBuilder sb = new StringBuilder();
        for(Point p : points){
            sb.append(p.x).append(' ').append(p.y).append("\n");
        }

        System.out.println(sb);
    }
}