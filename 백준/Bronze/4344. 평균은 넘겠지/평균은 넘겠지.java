import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        Scanner sc = new Scanner(System.in);
        int[] arr ;
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            // 학생 수
            arr = new int[N];

            double sum = 0;

            for (int j = 0; j < N; j++) {
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }

            double mean = (sum / N);
            double count = 0;
            // 평균 넘는 학생 수

            for (int j = 0 ; j < N; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N) * 100);
        }
    }
}