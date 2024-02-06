package boj.study.week2;

import java.io.*;
import java.util.*;

public class week2_5_p_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        bw.write("<");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K - 1; j++) {
                q.offer(q.poll());
            }
            if (i != N - 1) {
                bw.write(q.poll() + ", ");
            } else bw.write(q.poll() + "");
        }
        bw.write(">");
        bw.close();
    }
}
