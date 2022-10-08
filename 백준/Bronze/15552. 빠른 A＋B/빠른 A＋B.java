import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        for (int i = 0; i < T; i++) {
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//            System.out.println(A + B);
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bufferedWriter.write((a + b) + "\n");
        }
        bufferedWriter.flush();
    }

}

