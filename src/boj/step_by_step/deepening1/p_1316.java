package boj.step_by_step.deepening1;

import java.io.*;
import java.util.ArrayList;

public class p_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        String str;
        char[] strArr;
        char lastCh;
        int j;
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            strArr = str.toCharArray();
            lastCh = ' ';
            ArrayList<Character> arr = new ArrayList<>();
            for (j = 0; j < strArr.length; j++) {
                if (strArr[j] != lastCh) {
                    if (arr.contains(strArr[j])) {
                        break;
                    }
                    arr.add(lastCh);
                    lastCh = strArr[j];
                }
            }
            if (j == strArr.length) answer++;
        }
        bw.write(answer + "");
        bw.close();
    }
}
