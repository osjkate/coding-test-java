package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hold {

    public static int solution(int n, int k) {
        int answer = 1;
        if (k == 0) {
            return 1;
        }
        for (int i = 0; i < k; i++) {
            answer = answer * n % 10;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        hold T = new hold();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] keys = new int[n];
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            keys[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(T.solution(keys[i], values[i]));
        }
    }
}