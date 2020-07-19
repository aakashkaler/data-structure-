
import java.util.*;

public class Duplicatearray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++)
         {
            a[i]=scan.nextInt();
        }
        scan.close();

        for(int i=0;i<n;i++)
        {
            if(a[Math.abs(a[i])]>0)
            {
             a[Math.abs(a[i])]=-a[Math.abs(a[i])];
            }
            else
            {
                System.out.println(Math.abs(a[i]));
            } 
        }
}
}