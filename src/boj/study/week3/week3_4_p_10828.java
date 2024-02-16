package boj.study.week3;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class week3_4_p_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String op;
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            op = st.nextToken();
            switch (op) {
                case "push":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.pollLast() + "\n");
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "top":
                    if (deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.peekLast() + "\n");
                    break;
                default:
            }
        }
        bw.close();
    }
}
