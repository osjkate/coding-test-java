package boj.study.week2;

import java.io.*;
import java.util.Arrays;

public class week2_1_p_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        StringBuffer sb = new StringBuffer(new String(arr));

        bw.write(sb.reverse().toString());
        bw.close();
    }
}
