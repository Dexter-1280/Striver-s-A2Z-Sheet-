import java.util.*;

public class Reverse {
    static void reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int num = x % 10;
            x = x / 10;
            rev = rev * 10 + num;
        }

        System.out.println(rev);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
System.out.println("Enter the integer to reverse :");
        reverse(x);

        sc.close();
    }
}