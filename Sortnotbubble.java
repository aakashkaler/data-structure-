import java.util.*;
public class Sortnotbubble
 {
    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++)
         {
            a[i]=scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < n-1; i++)
         {
             int k;
             for(int j=i+1;j<n;j++)
             {
                if(a[i]>a[j])
                {
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;
                }
             }
            
        }
        for (int i = 0; i < n; i++)
        {
           System.out.println(a[i]);
       }
    
}
 }