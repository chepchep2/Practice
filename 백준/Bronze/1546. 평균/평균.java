import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        double sum = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }
        System.out.println(sum / arr.length);
    }
}