import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        String[] arr = new String[T];
        
        for (int i = 0; i < T; i++) {
            arr[i] = sc.next();
        }
        
        for (int i = 0; i < T; i++) {
            int cnt = 0;
            int sum = 0;
            
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}