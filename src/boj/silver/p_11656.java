package boj.silver;

import java.io.*;
import java.util.Arrays;

public class p_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] strArr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strArr[i] = str.substring(i);
        }
        Arrays.sort(strArr);
        for (String x : strArr) {
            bw.write(x + "\n");
        }
        bw.close();
    }
}
