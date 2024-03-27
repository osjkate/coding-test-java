package boj.study.week7;

import java.io.*;

public class p3_9663 {
    public static int N;
    public static int count = 0;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        bw.write(count + "");
        bw.close();
    }

    public static void nQueen(int queenCount) {
        if (queenCount == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[queenCount] = i; // 놓을 수 없는 경우 1씩 증가한다.
            if (possibility(queenCount)) {
                nQueen(queenCount + 1);
            }
        }
    }
    public static boolean possibility(int depth) {
        for (int i = 0; i < depth; i++) {
            // 동일한 행에 퀸을 가졌는지 확인하기
            if (arr[depth] == arr[i]) {
                return false;
            }
            // 대각선상에 퀸을 가졌는지 확인하기
            // 행과 열의 차이가 같으면 동일한 대각선상에 있음!
            else if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i] ))
                return false;
        }
        return true;
    }
}
