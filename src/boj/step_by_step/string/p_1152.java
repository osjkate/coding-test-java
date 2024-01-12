package boj.step_by_step.string;

import java.io.*;

public class p_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int cnt = 0;
        boolean flag = true;
        for (char x : str.toCharArray()) {
            if (x != ' ' && flag) {
                cnt++;
                flag = false;
            }
            if (x == ' ' && !flag) {
                flag = true;

            }
        }
        bw.write(cnt + "\n");
        bw.close();
    }
}
