import java.util.*;
public class Largestarray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),h;
        int a[]=new int[n];
        for (int i = 0; i < n; i++)
         {
            a[i]=scan.nextInt();
        }
        scan.close();
          h=a[0];
        for (int i = 0; i < a.length; i++) {
            if(h<a[i])
            {
                h=a[i];
            }
            
        }
        System.out.println(h);
    }
}