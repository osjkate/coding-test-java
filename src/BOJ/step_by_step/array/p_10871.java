package BOJ.step_by_step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        s = br.readLine();
        st = new StringTokenizer(s);
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (X > n) {
                System.out.print(n + " ");
            }
        }
    }
}
