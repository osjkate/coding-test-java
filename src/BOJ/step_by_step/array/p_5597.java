package BOJ.step_by_step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = 1;
        }
        for (int i = 1; i < 31; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
