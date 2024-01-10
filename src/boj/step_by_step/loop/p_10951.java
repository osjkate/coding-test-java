package boj.step_by_step.loop;

import java.io.*;
import java.util.StringTokenizer;

// EOF(End Of File) : 파일 종료 조건 없이 그냥 입력이 주어진 경우
// 즉, 입력에서 더 이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라
// BufferedReader의 경우 null을 반환한다.


public class p_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.close();
    }
}
