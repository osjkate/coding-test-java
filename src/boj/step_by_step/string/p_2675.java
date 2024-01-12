package boj.step_by_step.string;

import java.io.*;
import java.util.StringTokenizer;

public class p_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String answer = "";
            for (char x : str.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    bw.write(x + "");
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}
