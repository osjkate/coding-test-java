package boj.study.week7;

import java.io.*;
import java.util.StringTokenizer;

public class p2_1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] intArr = new int[N + 1];
        int[] answer = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (intArr[i] == 0) {
                for (int j = 1; j <= N; j++) {
                    if (answer[j] == 0) {
                        answer[j] = i;
                        break;
                    }
                }
            } else {
                for (int j = 1; j <= N; j++) {
                    if (answer[j] == 0) count++;
                    if (count == intArr[i] + 1) {
                        answer[j] = i;
                        count = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            bw.write(answer[i] + " ");
        }
        bw.close();
    }
}
