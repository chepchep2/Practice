import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        HashSet<Integer> set = new HashSet<>();
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            set.add(arr[i] % 42);
            
        }
        System.out.println(set.size());
    }
}

