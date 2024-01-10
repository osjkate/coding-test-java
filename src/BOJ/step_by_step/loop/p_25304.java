package BOJ.step_by_step.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] price = new int[n];
        int[] num = new int[n];
        String s;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            price[i] = Integer.parseInt(st.nextToken());
            num[i] = Integer.parseInt(st.nextToken());
        }
        int sumPrice = 0;
        for (int i = 0; i < n; i++) {
            sumPrice += (price[i] * num[i]);
        }
        if (sum == sumPrice) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
