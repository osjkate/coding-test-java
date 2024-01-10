package BOJ.step_by_step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int remain = n % 42;
            for (int j = 0; j < 10; j++) {
                if (arr[j] == -1) {
                    arr[j] = remain;
                    break;
                } else {
                    if (arr[j] == remain) {
                        break;
                    }
                }
            }
        }
        int i = 0;
        for (; i < 10; i++) {
            if (arr[i] == -1) {
                System.out.println(i);
                break;
            }
        }
        if (i == 10) {
            System.out.println(10);
        }
    }
}
