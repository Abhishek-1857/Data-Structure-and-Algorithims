
class Linkedlist{

Node head;
 int size;

Linkedlist(){
    this.size=0; 
}

 class Node{
    int data;
    Node next;

    Node(int value){
        data=value;
        next=null;
        size++;
    }

}


public void addFirst(int data){
    Node newNode= new Node(data);
    if(head==null){
       head=newNode;
    }
    else{
    newNode.next=head;
    head=newNode;
    }
}

public void addLast(int data){
    Node newNode= new Node(data);
    if(head==null){
       head=newNode;
      
    }
    else{
    Node currNode=head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newNode;
}
}

public void deleteFirst(){
    if(head==null){
        System.out.println("Khali list hai bhai");
        return;
    }
    size--;
    head=head.next;
}

public void deleteLast(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    size--;
    if(head.next==null){
        head=null;
        return;
    }

    Node secondLastNode=head;
    Node lastNode=head.next;
    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLastNode=secondLastNode.next;
    }
    secondLastNode.next=null;
}

public void printList(){
if(head==null){
    System.out.println("List is empty");   
}
else{
    Node currNode=head;
    while(currNode!=null){
        System.out.print(currNode.data + "->");
        currNode=currNode.next;
    }
   System.out.println("NULL");
}
}
public int getSize(){
    return size;
}
}

public class linkedlist{
public static void main(String args []){

    Linkedlist list = new Linkedlist();

    list.addFirst(10);
    list.addFirst(20);
    list.printList();

    list.addLast(30);
    list.printList();

    list.deleteLast();
    list.printList();

    list.deleteFirst();
    list.printList();

   System.out.println(list.getSize());

}
}


