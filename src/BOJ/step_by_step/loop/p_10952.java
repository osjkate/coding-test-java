package BOJ.step_by_step.loop;

import java.io.*;
import java.util.StringTokenizer;

public class p_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        StringTokenizer st;
        while(true) {
            s = br.readLine();
            if (s.equals("0 0")) {
                break;
            }
            st = new StringTokenizer(s);
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.close();
    }
}
