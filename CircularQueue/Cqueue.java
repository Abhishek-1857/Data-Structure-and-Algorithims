class circualarqueue {
    private int f=-1;
    private int r=-1;
    private int arr[];
    private int capacity;

    circualarqueue(int size){
        arr=new int[size];
        capacity=size;
    }

    public void enqueue(int value){
       if( isFull()){
        System.out.println("Queue is Full Kal aana");
        
       }
       else{
        r=(r+1)%arr.length;
        if(f==-1)
        {
            f=0;
        }
       arr[r]=value;
       System.out.println("inserted"+value);
       }
    }

    public int dequeue(){
        int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = arr[f];
      if (f == r) {
        f = -1;
        r = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        f++;
      }
 
      return element;
    }
    }
    public boolean isFull(){
        return r==arr.length;
    }

    public void printQueue(){
        for(int i=f;i<=r;i++){
            System.out.println(arr[i]);
        }
    }
    public boolean isEmpty(){
        return f==-1;
    }
    public void peek(){
        System.out.println(arr[f]);
    }
}


public class Cqueue {
    public static void main(String args []) {
        circualarqueue q=new circualarqueue(5);
      
        q.enqueue(5);

        q.enqueue(10);
   
        q.enqueue(10);

        q.enqueue(10);

        q.enqueue(10);


         
        System.out.println();


        q.printQueue();

 

    }
}