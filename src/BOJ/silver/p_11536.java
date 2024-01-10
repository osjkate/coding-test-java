package BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_11536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        if (arr[0].compareTo(arr[1]) > 0) {
            int i = 0;
            for (; i < N - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) < 0) {
                    System.out.println("NEITHER");
                    break;
                }
            } if (i == N - 1) System.out.println("DECREASING");
        } else {
            int i = 0;
            for (; i < N - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    System.out.println("NEITHER");
                    break;
                }
            } if (i == N - 1) System.out.println("INCREASING");
        }
    }
}
