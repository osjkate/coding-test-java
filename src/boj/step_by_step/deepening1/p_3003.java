package boj.step_by_step.deepening1;

import java.io.*;
import java.util.StringTokenizer;

public class p_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] total = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            bw.write(total[i] - Integer.parseInt(st.nextToken()) + " ");
        }
        bw.close();
    }
}
