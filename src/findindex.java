//Find an element which having value equal to it index {-4, 2, 2, 4, 4, 9}
//                                                        0   1  2  3  4  5
public class findindex {
    public static void main(String[] args) {
        int a[]={-4, 2, 2, 4, 4, 9};
        for (int i=0; i<a.length; i++)
        {
            if (a[i]==i)
                System.out.println(i);
        }

    }
}
