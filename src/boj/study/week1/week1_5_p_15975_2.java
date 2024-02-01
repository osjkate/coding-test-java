package boj.study.week1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이중 배열로 해서 시간초과 됨
public class week1_5_p_15975_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[][] arr = new long[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }

        long sum = 0;

        Arrays.sort(arr, (arr_1, arr_2) ->
                (int) (arr_1[0] - arr_2[0]));

        for (int i = 0; i < N; i++) {
            int up = 1, down = 1;
            if (i == 0) {
                for (int j = i + 1; j < N; j++) {
                    if (arr[i][1] == arr[j][1]) {
                        sum += Math.abs(arr[i][0] - arr[j][0]);
//                        bw.write("i = " + i + ", up = " + up + ", down = " + down);
                        break;
                    }
                }
            }
            else if (i == N - 1) {
                for (int j = i - 1; j > -1; j--) {
                    if (arr[i][1] == arr[j][1]) {
                        sum += Math.abs(arr[i][0] - arr[j][0]);
//                        bw.write("i = " + i + ", up = " + up + ", down = " + down);
                        break;
                    }
                }
            }
            else {
                while (i + up < arr.length - 1 && arr[i][1] != arr[i + up][1]) up++;
                while (i - down > 0 && arr[i][1] != arr[i - down][1]) down++;
//                bw.write("i = " + i + ", up = " + up + ", down = " + down);

                if (arr[i][1] == arr[i + up][1] && arr[i][1] == arr[i - down][1])
                    sum += Math.min(Math.abs(arr[i][0] - arr[i + up][0]),
                                    Math.abs(arr[i][0] - arr[i - down][0]));
                else if (arr[i][1] == arr[i + up][1]) sum += Math.abs(arr[i][0] - arr[i + up][0]);
                else if (arr[i][1] == arr[i - down][1]) sum += Math.abs(arr[i][0] - arr[i - down][0]);
            }
//            bw.write(", sum = " + sum + "\n");
        }
        bw.write(sum + "");
        bw.close();
    }
}
