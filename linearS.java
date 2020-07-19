import java.util.*;
public class linearS {
    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),k,i;
        
        int a[]=new int[n];

        for (i = 0; i < n; i++)
         {
            a[i]=scan.nextInt();
        }
        System.out.println("enter element to be search");
        k=scan.nextInt();
        scan.close();
        for (i = 0; i < n-1; i++)
         {
           if(k==a[i])
           {
               break;
           }
        }
        System.out.println("element found at "+i);
    

    }
}
