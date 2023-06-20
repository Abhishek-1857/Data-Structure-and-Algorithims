

class doublyLinkedList{
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
            return false;
        }
        else{
        Node curreNode=head;
        while(curreNode!=null){
            if(curreNode.data==value){
               
                return true;
            }
            curreNode=curreNode.next;
        }
    }
        return false;
    }
}
public class set {
    doublyLinkedList dl;
    int capacity;
    int index;
    boolean flag;

    public set(){
        dl=new doublyLinkedList();
        flag=false;

    }

    public boolean contains(int value){
       if(dl.listContain(value)){
        return true;
       }
        return false;
    }

    public void addFirst(int value){
       if(contains(value)){
            System.out.println("Already present");
            
           }
           else{
            dl.addFirst(value);
           }      
    }
    public void addLast(int value){
        if(contains(value)){
             System.out.println("Already present");
             
            }
            else{
             dl.addLast(value);
            }  
             
             
     }

    public void print(){
        dl.printList();
    }

    public void remove(int value){
        if(!contains(value)){
            System.out.println("No such element");
            
           }
           else{
            dl.remove(value);
           }  
        
    }

    public static void main(String[] args) {

        set s=new set();
        s.addLast(1);
        s.print();
        s.addLast(2);
        s.print();
        s.addLast(3);
        s.print();
        s.addLast(3);
        s.addLast(4);
        s.print();
        s.addLast(5);
        s.print();
        // s.remove(6);
        s.addLast(2);
       
    }
}
