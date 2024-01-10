package BOJ.step_by_step.loop;

import java.io.*;
import java.util.StringTokenizer;

public class p_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n");
        }
        bw.close();
    }
}
