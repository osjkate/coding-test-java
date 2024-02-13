package boj.study.week3;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class week3_1_p_20301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int idx = 1;
        int count = 0;
        boolean flag = true;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.offerLast(i);
        }

        while (!deque.isEmpty()) {
            if (flag) {
                if (idx % K == 0) {
                    bw.write(deque.pollFirst() + "\n");
                    count++;
                }
                else deque.offerLast(deque.pollFirst());
            } else {
                if (idx % K == 0) {
                    bw.write(deque.pollLast() + "\n");
                    count++;
                }
                else deque.offerFirst(deque.pollLast());
            };
            if (count != 0 && count % M == 0) {
                flag = !flag;
                count = 0;
            }
            idx++;
        }
        bw.close();
    }
}
