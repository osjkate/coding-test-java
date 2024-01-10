package BOJ.step_by_step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int[] arr2 = new int[9];
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            arr2[i] = n;
        }
        Arrays.sort(arr);
        int maxNum = arr[8];
        int cnt = 0;
        for (int i = 0; i < 9; i++) {
            if (arr2[i] == maxNum) {
                cnt = ++i;
                break;
            }
        }
        System.out.println(maxNum);
        System.out.println(cnt);
    }
}
