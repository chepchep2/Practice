
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        System.out.println(max);

        int min = (a * b) / max;

        System.out.println(min);
    }
}