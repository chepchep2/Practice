import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && a == c && b == c) {
            a = 10000 + a * 1000;
            System.out.println(a);
        } else if (a == b || a == c) {
            a = 1000 + a * 100;
            System.out.println(a);
        } else if (b == c) {
            b = 1000 + b * 100;
            System.out.println(b);
        } else {
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
        }
    }
}