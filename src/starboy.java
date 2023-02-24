import java.util.Scanner;

public class starboy {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int n = S.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
