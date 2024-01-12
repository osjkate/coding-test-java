package boj.step_by_step.string;

import java.io.*;

public class p_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        // 입력에 끝이 명시되지 않은 경우
        while ((str = br.readLine()) != null) {
            bw.write(str + "\n");
        }
        bw.close();
    }
}
