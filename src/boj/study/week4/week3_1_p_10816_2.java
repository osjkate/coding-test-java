package boj.study.week4;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// 틀림
public class week3_1_p_10816_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int num;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            if (map.keySet().contains(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            num = Integer.parseInt(st.nextToken());
            if (map.keySet().contains(num)) {
                bw.write(map.get(num) + " ");
            } else {
                bw.write("0 ");
            }
        }
        bw.close();
    }

}