package boj.step_by_step.deepening1;

import java.io.*;

public class p_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j > i; j--) {
                bw.write(' ');
            }
            for (int j = 0; j < num; j++) {
                bw.write('*');
            }
            num += 2;
            bw.write('\n');
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < num - 4; j++) {
                bw.write('*');
            }
            num -= 2;
            bw.write('\n');
        }
        bw.close();
    }
}
