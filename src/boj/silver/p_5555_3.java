package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 비교할때는
// str1.equals(str2) 사용하기
public class p_5555_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split("");
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String[] compare = br.readLine().split("");
            int j = 0;
            for (; j < compare.length; j++) {
                if (compare[j].equals(arr[0])) {
                    break;
                }
            }
            if (j == compare.length) continue;
            else {
                int k = 0;
                for (; k < arr.length; k++) {
                    if (!arr[k].equals(compare[j])) break;
                    j++;
                    if (j >= compare.length) j = 0;
                }
                if (k == arr.length) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
