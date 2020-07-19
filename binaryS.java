import java.util.*;

public class binaryS {
    
    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),ub,lb,m,k,i;
        int a[]=new int[n];
        for ( i = 0; i < n; i++)
         {
            a[i]=scan.nextInt();
        }
        System.out.println("enter element to be find");
        k=scan.nextInt();
        scan.close();
        ub=n-1;
        lb=0;
        m=(ub+lb)/2;
        for(i=lb;i<=ub;i++)
        {
           if(a[m]==k)
           {
               break;
           }
           else if(k<a[m])
           {
             ub=m-1;
             lb=0;
             m=(ub+lb)/2;
           }
           else 
           {
            ub=n-1;
            lb=m;
            m=(ub+lb)/2; 
           }
        }
        System.out.println("elemnt found at "+m);
    }

}