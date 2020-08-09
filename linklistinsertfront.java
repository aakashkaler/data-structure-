
import java.util.*;
import java.io.*; 
import java.lang.*; 

public class linklistinsertfront {
    
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
     public static linklistinsertfront insert(linklistinsertfront l ,int d)
 {
     
     Node new_frontnode= new Node(d);
     new_frontnode.next=l.head;
     l.head=new_frontnode;
    
     
     
     
     return l;
     }
    
     public static void printList(linklistinsertfront list) 
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
         
        linklistinsertfront list = new linklistinsertfront(); 
          list.head=null;
          list.head=new Node(1);
          list.head.next=new Node(2);
          list.head.next.next=new Node(3);
          list.head.next.next.next=new Node(4);
         int a;
         Scanner s=new Scanner(System.in);
         System.out.println("eneter element to insert at front");
         a=s.nextInt();
         list = insert(list,a);
   
         
         printList(list); 
     } 
}