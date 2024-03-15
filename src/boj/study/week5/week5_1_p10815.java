package boj.study.week5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class week5_1_p10815 {
    static ArrayList<Integer> card;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        card = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            card.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(card);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            bw.write(binary_search(0, card.size() - 1, Integer.parseInt(st.nextToken())) + " ");
        }
        bw.close();
    }

    public static int binary_search(int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (card.get(mid) == target) {
                return 1;
            } else if (card.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
