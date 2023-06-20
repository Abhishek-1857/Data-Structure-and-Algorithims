import java.util.*;
class ListNode{
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        
        Node(int value){
            data=value;
            next=null;
            size++;
        }
    }
    
    public void add(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            
        }
        else{
        Node curhead=head;
        while(curhead.next!=null){
            curhead=curhead.next;
        }
        curhead.next=newNode;
    }
    }
    
    public int size(){
        return size;
    }
    
    public int[] toArray(){
        int n=size();
        int[] arr=new int[n];
        int i=0;
        Node curhead=head;
        while(i<n&& curhead!=null){
            arr[i]=curhead.data;
            curhead=curhead.next;
            i++;
        }
        return arr;
    }
    public void print(){
         if(head==null){
         System.out.println("List is empty");   
          }
          else{
              Node currNode=head;
              System.out.print("[");
              while(currNode!=null){
              System.out.print(currNode.data + ",");
              currNode=currNode.next;
              }
              System.out.println("]");
          }
    }
    
    
    
    
}
class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode l=new ListNode();
        int n=list1.size();
        int m=list2.size();
        int[] arr1=list1.toArray();
        int a1=arr1.length;
        int[] arr2=list2.toArray();
        int a2=arr2.length;
        int[] arr3=new int[n+m];
        
        for(int i=0;i<a1;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<a2;i++){
            arr3[a1+i]=arr2[i];
        }
        
        for(int i=0;i<arr3.length-1;i++){
            for(int j=0;j<arr3.length-i-1;j++){
                if(arr3[j]>arr3[j+1]){
                    int temp=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<arr3.length;i++){
            l.add(arr3[i]);
        }
        
        
        return l;
        
        
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ListNode list1=new ListNode();
        ListNode list2=new ListNode();
        
        for(int i=0;i<3;i++){
            list1.add(sc.nextInt());
        }
        for(int i=0;i<3;i++){
            list2.add(sc.nextInt());
        }

       
        ListNode list3=mergeTwoLists(list1,list2);
        
     list3.print();
   
        
        


        
    }
}