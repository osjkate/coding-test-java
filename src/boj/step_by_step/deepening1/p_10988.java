package boj.step_by_step.deepening1;

import java.io.*;

public class p_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int answer = 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                answer = 0;
                break;
            }
        }
        bw.write(answer + "");
        bw.close();
    }

//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String str = br.readLine();
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        int answer = 1;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != sb.charAt(i)) {
//                answer = 0;
//                break;
//            }
//        }
//        bw.write(answer + "");
//        bw.close();
//    }
}
