package boj.study.week4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class week3_5_p2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int lo = 1;
        int hi = arr[N - 1];

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            int position = 0;
            int cnt = 1;    // 설치 가능한 공유기 수?
            for (int i = 0; i < N; i++) {
                if (arr[i] - arr[position] >= mid) {
                    position = i;
                    cnt++;
                }
            }
            if (cnt < C) { // 설치된 공유기 수가 가지고 있는 공유기의 수보다 적으면
                hi = mid - 1; // upper bound 내림으로써 최소 거리 줄인다.
                continue;
            }

            //설치된 공유기 수가 가지고 있는 공유기 수보다 크다면
            lo = mid + 1;
        }
        bw.write(lo - 1 + "");
        bw.close();
    }
}
