package boj.study.week4;

import java.io.*;
import java.util.StringTokenizer;

public class week3_4_p1629 {
    public static long C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 답은 맞는데 틀렸다고 나옴 시간초과도 아니고 왜쥬?
        // 모듈러 성질 사용!
        // (A * B) mod C = (A mod C * B mod C) mod C
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
//        long answer = 1L;
//        for (int i = 0; i < B; i++) {
//            answer *= A;
//            answer %= C;
//        }
//        bw.write(answer % C + "");

        bw.write(pow(A, B) + "");
        bw.close();
    }

    public static long pow(long base, long exponent) {
        if (exponent == 1) {
            return base % C;
        }

        long temp = pow(base, exponent / 2);

        if (exponent % 2 != 0) {
            return (temp * temp % C) * base % C;
        }
        return temp * temp % C;
    }
}
