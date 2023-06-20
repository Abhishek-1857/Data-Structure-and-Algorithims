class DoublyLinkedList{
    Node head;
    private int size;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int value){
            data=value;
            next=null;
            prev=null;
            size++;
        }
    }

    public void addFirst(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
    }

    public void addLast(int value){
        Node newNode= new Node(value);
        if(head==null){
           head=newNode;
          
        }
        else{
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        newNode.prev=currNode;
        currNode.next=newNode;
    }
    }
 

    public void deleteFirst(){
if(head==null){
    System.out.println("List is empty");
}else{
    head=head.next;
    size--;
}
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
            System.out.print("NULL<->");
            while(currNode!=null){
                System.out.print(currNode.data + "<->");
                currNode=currNode.next;
            }
           System.out.println("NULL");
        }
    }

    public int getSize(){
        return size;
    }

    public void remove(int value){
        if(head==null){
            System.out.println("List is empty");
          return;
        }
        size--;
        if(head.next==null&&head.data==value){
            head=null;
        }
        Node temp=head;
        Node ptr=head.next;
        while(ptr.next!=null){
            temp=temp.next;
            ptr=ptr.next;
            if(ptr.data==value&&ptr.next!=null){
                Node next=ptr.next;
                next.prev=temp;
                temp.next=next;
            }
            else if(ptr.data==value&&ptr.next==null){
                temp.next=null;

            }
        }
        ptr.next=null;
        ptr.prev=null;
    }

    public boolean listContain(int value){
       
        if(head==null){
            System.out.println("LIst is empty");
            return false;
        }
        Node curreNode=head;
        while(curreNode!=null){
            if(curreNode.data==value){
               
                return true;
            }
            curreNode=curreNode.next;
        }
        return false;
    }
}
public class main {

    public static void main(String[] args) {

        DoublyLinkedList list=new DoublyLinkedList();
        list.addFirst(12);
        list.printList();
        list.addFirst(13);
        list.printList();
        list.addFirst(14);
        list.printList();
        list.addLast(15);
        list.printList();
        list.addFirst(9);
        list.printList();
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        list.remove(13);
        list.printList();
            list.remove(13);
        list.printList();

        System.out.println("Size of list is : "+list.getSize());

        System.out.println(list.listContain(10));

    }
    
}
