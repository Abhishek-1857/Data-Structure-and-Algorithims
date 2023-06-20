import java.util.Arrays;
import java.util.Random;

class HashSet{
Random rd;
int[] arr;
int size;
 public HashSet(){
    arr=new int[10];
    size=0;
    rd=new Random();
 }

 public HashSet(int Size){
    arr=new int[Size];
    size=0;
 }

public boolean contains(int value){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==value){
            return true;
        }
    }
    return false;
}

 public void add(int value){
      
     if(size==arr.length/2-1){
        increaseListSize();
     }
if(contains(value)){
    System.out.println("Already Present");
}
else{
    
    int index=rd.nextInt(arr.length);
    int temp=index;
    if(arr[index]==0)
    {
        arr[index]=value;
        size++;
    }
    else{
        index++;
        arr[index]=value;
    }
}

 }

public void increaseListSize(){
        arr = Arrays.copyOf(arr, arr.length*2);
    }

    public void printSet(){
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        System.out.print(arr[i]+" ");
      }
    }
    System.out.println();
    }

    public void getSize(){
        System.out.println(arr.length);
    }

    public void remove(int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                arr[i]=0;
            }
            // else{
            //     System.out.println("Element not present");
            // }
        }
        
    }
}



public class main {

    public static void main(String[] args) {

        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.printSet();
        hs.remove(40);
        hs.printSet();
        // hs.remove(60);
        
     

    // Random r=new Random();
    // int index=r.nextInt(10);
    // System.out.println(index);
   

    }
    
}
