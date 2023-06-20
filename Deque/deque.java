class  Deque{
 int capacity;
 int f;
 int r;
 int arr[];
 
 Deque(int size){
    f=-1;
    r=-1;
    arr=new int[size];
    capacity=size;
 }

 public void enqueueFront(int value){

    if( isFull()){
        System.out.println("Bharaa huaa haii queue");
        return;
    }

    if(f==-1&&r==-1){
        f=r=0;
        arr[f]=value;
    }
    else if(f==0){
        f=capacity-1;
        arr[f]=value;
    }
    else{
        f=f-1;
        arr[f]=value;
    }

 }

 public void enqueueRear(int value){
    if( isFull()){
        System.out.println("Bhara hai bhai");
        return;
    }
    else{
        r=(r+1)%capacity;
    if(f==-1){
        f=0;
    }
    arr[r]=value;
        }
 }

 public  boolean isFull(){
return f==0&&r==capacity-1|| f==r+1;
 }

 public boolean isEmpty(){
    return f==-1&&r==-1;
 }


 void display()    
 {    
     int i=f;    
     System.out.println("Elements in a deque are: ");
         
     while(i!=r)    
     {  
        System.out.println(arr[i]);  
    
         i=(i+1)%capacity;    
     }    
     System.out.println(arr[r]);    
 }    

 public int dequeueFront(){
if( isEmpty()){
    System.out.println("Khali queue se ka nikaloge bhai");
    return 1;
}
else{
    int element=arr[f];
if(f==r){
    f=-1;
    r=-1;
}
else if(f==capacity-1){
    f=0;
}
else{
    f=f+1;
}
 
 return element;
}
}

public int dequeueRear(){
    if( isEmpty()){
        System.out.println("Khali queue se ka nikaloge bhai");
        return -1;
    }
    else{
        int element=arr[r];
        if(f==r){
            f=-1;
            r=-1;
        }
        else if(r==0){
            r=capacity-1;
        }
        else{
            r=r-1;
        }
        return element;
    }
}
public int f(){
    return f;
}
}
public class deque {
    public static void main(String args []){
        Deque d=new Deque(5);
        d.enqueueFront(1);
        d.enqueueFront(2);
        d.enqueueFront(3);
        d.enqueueFront(14);
        d.enqueueFront(20);
      
      
      
        d.display();
System.out.println();
        d.dequeueFront();
        d.display();
        System.out.println();
        d.dequeueRear();
        d.display();
        System.out.println();



    }
}

