import java.util.*;
public class GreatestOfTwoNumbers {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n > m)
            System.out.println( n +  "is greater");
        else if (n < m)
            System.out.println(m + "is greater");
        else
            System.out.println("The numbers are equal");

    }
}
