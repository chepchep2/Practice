import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
        boolean[] arr = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            arr[n] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }

    }
}