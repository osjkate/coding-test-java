package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 반지가 아니면 이렇게 풀면 됨
public class p_5555_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Pattern p = Pattern.compile(".*" + s + ".*");
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            s = br.readLine();
            Matcher m = p.matcher(s);
            if (m.matches()) cnt++;
        }
        System.out.println(cnt);
    }
}
