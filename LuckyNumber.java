import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int r = n / 2;
        int sum = 0;
        int c = 0;
        for (int i = 0; i < r; i++) {
            sum = sum + s.charAt(i);
        }
        for (int j = r; j < n; j++) {
            c = c + s.charAt(j);
        }
        if (sum == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
