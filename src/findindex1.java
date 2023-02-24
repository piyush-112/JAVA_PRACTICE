//Find an element which having value equal to it index {-4,-8, 5, 3, 4, 8, 9, 4, 7, 8, 5, 2, 6, 9, 4, 15, 16}
public class findindex1 {
    public static void main(String[] args) {
        int i;
        int[] a = {-4,-8, 5, 3, 4, 8, 9, 4, 7, 8, 5, 2, 6, 9, 4, 15, 16};
        for (i=0; i<a.length; i++)
        {
            if (a[i]==i)
                System.out.println(i);
        }
    }
}
