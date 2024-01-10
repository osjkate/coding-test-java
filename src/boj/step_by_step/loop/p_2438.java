package boj.step_by_step.loop;

import java.io.*;

public class p_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= N; i++) {
            while (count != i) {
                bw.write("*");
                count++;
            }
            count = 0;
            bw.write("\n");
        }
        bw.close();
    }
}
