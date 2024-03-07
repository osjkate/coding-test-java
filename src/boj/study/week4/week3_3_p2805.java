package boj.study.week4;

import java.io.*;
import java.util.StringTokenizer;

public class week3_3_p2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int max = 0, min = 0;

        int[] tree = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (max < tree[i]) {
                max = tree[i];
            }
        }
        // 자르는 높이를 가장 큰 나무와 min 값 사이의 값으로 초기화
        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;

            /**
             * sum 구하기
             */
            for (int treeHeight : tree) {
                if (treeHeight - mid > 0) {
                    sum += (treeHeight - mid);
                }
            }
            // sum 이 M보다 작으면 자르는 위치를 낮춰야 함.
            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        bw.write(min - 1 + "");
        bw.close();
    }
}
