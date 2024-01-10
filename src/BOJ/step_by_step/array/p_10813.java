package BOJ.step_by_step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            basket = change(basket, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        for (int x : basket) System.out.print(x + " ");
    }

    static int[] change(int[] arr, int n, int m) {
        int temp = arr[n - 1];
        arr[n - 1] = arr[m - 1];
        arr[m - 1] = temp;
        return arr;
    }
}
