package BOJ.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        while (true) {
            if (M + time >= 60) {
                if (++H >= 24) H = 0;
                time = time + M - 60;
                M = 0;
            } else {
                M = M + time;
                break;
            }
        }
        System.out.println(H + " " + M);
    }
}
