package boj.study.week2;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class week2_6_p_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str;
        char[] arr;
        Deque<Character> de = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int flag = 0;
            str = br.readLine();
            arr = str.toCharArray();
            for (char x : arr) {
                if (x == '(') {
                    de.addFirst(x);
                } else {
                    if (de.isEmpty()) {
                        flag = 1;
                        break;
                    } else de.pollFirst();
                }
            }
            if (de.isEmpty() && flag == 0) {
                bw.write("YES\n");
            } else bw.write("NO\n");
            de.clear();
        }
        bw.close();
    }
}
