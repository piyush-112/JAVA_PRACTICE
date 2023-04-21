import java.util.*;
public class GreatestOfTwoNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n==m)
            System.out.println("The numbers are equal");
        else System.out.println(Math.max(n,m) + "is greater");
    }
}
