package boj.step_by_step.string;

import java.io.*;

public class p_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char s = br.readLine().charAt(0);
//        System.out.println((int) s);
        bw.write(((int) s) + "\n");
        // "\n" 추가 안하면 아스키 코드로 인식되지 않고 문자형으로 출력됨!
        bw.close();
    }
}
