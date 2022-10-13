import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

//        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N;i ++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


        System.out.println((arr[0]) + " " + arr[arr.length-1]);
    }
}

