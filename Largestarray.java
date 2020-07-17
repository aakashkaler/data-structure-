import java.util.*;
public class Largestarray {

    public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        int h;
        final int a[] = new int[n];
        for (int i = 0; i < n; i++)
         {
            a[i]=scan.nextInt();
        }
        scan.close();
          h=a[0];
        for (int i = 0; i < a.length; i++) {
            if(h<a[i]);
            {
                h=a[i];
            }
            
        }
        System.out.println(h);
    }
}