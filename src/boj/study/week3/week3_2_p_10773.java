package boj.study.week3;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class week3_2_p_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(br.readLine());
        int num, sum = 0;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < K; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) deque.pollLast();
            else deque.offerLast(num);
        }
        while (!deque.isEmpty()) sum += deque.pollLast();
        bw.write(sum + "");
        bw.close();
    }
}
