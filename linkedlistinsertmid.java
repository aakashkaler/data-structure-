
import java.util.*;
import java.io.*; 
import java.lang.*; 

public class linkedlistinsertmid {
    Node head;
   static int le=0;
    static class Node
     {
         Node next;
         int data;
         Node(int d)
          {
            data=d;
            next=null;
         }

     }
    public static linkedlistinsertmid insert(linkedlistinsertmid l ,int d)
{
    
    Node new_midnode= new Node(d);
    Node prt=l.head;
    int m=0;
    while(prt!=null)
    {
       prt=prt.next;
       le++;
    }
    System.out.println(le);
    prt=l.head;
    while(m!=le/2-1)
    {
       prt=prt.next;
       m++;
    }
    new_midnode.next=prt.next;
    prt.next=new_midnode;
    
    return l;
    }
   
    public static void printList(linkedlistinsertmid list) 
    { 
        Node currNode = list.head; 
        
   
        System.out.print("LinkedList: "); 
   
    
        while (currNode != null) { 
            
            System.out.print(currNode.data + " "); 
        
            currNode = currNode.next; 
        } 
}
public static void main(String[] args) 
    { 
        
        linkedlistinsertmid list = new linkedlistinsertmid(); 
         list.head=null;
         list.head=new Node(1);
         list.head.next=new Node(2);
         list.head.next.next=new Node(3);
         list.head.next.next.next=new Node(4);
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("eneter element to insert at mid");
        a=s.nextInt();
        list = insert(list,a);
  
        
        printList(list); 
    } 
} 