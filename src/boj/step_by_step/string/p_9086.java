package boj.step_by_step.string;

import java.io.*;

public class p_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
//            System.out.print(s.charAt(0));
            bw.write(s.charAt(0));
//            System.out.println(s.charAt(-1)); 이거 안됨!! 에러남
//            System.out.println(s.charAt(s.length() - 1));
            bw.write(s.charAt(s.length() - 1) + "\n");
        }
        bw.close();

    }
}
