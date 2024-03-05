package boj.study.week4;

import java.io.*;
import java.util.StringTokenizer;

public class week3_2_p1780 {
    public static int[][] arr;
    public static int MINUS_ONE = 0;
    public static int ZERO = 0;
    public static int ONE = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);
        bw.write(MINUS_ONE + "\n" + ZERO + "\n" + ONE);
        bw.close();
    }

    public static void partition(int row, int col, int size) {

        // 배열 속 모든 수가 같은 수라면 해당 숫자를 증가시키고 리턴
        if (colorCheck(row, col, size)) {
            if (arr[row][col] == -1) {
                MINUS_ONE++;
            } else if (arr[row][col] == 0) {
                ZERO++;
            } else {
                ONE++;
            }
            return;
        }

        int newSize = size / 3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + 2 * newSize, newSize);

        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize, col + 2 * newSize, newSize);

        partition(row + 2 * newSize, col, newSize);
        partition(row + 2 * newSize, col + newSize, newSize);
        partition(row + 2 * newSize, col + 2 * newSize, newSize);
    }

    // 해당 영역이 같은 색으로 이루어져있는지 확
    public static boolean colorCheck(int row, int col, int size) {
        int color = arr[row][col];

        //
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != arr[i][j]) return false;
            }
        }
        return true;
    }
}
