package boj.step_by_step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int v = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(s);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (v == Integer.parseInt(st.nextToken())) cnt++;
        }
        System.out.println(cnt);
    }
}
