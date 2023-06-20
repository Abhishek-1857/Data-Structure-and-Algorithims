
import java.util.Arrays;

class ArrayList<T>{
    int[] arr;
    int index;


    public ArrayList(){ 
      arr=new int[10];
      index=0;
    }
    public ArrayList(int size){
        arr=new int[size];
        index=0;
    }

    

    public void add(int value){
        if(index==arr.length/2-1){
            increaseListSize();
        }
       
            arr[index]=value;
            index++;
        
    }

    public void remove(int ind){
        if(ind<index){
            arr[ind]=0;
            int tmp=ind;
            int tmp2=index;
            while(ind<tmp2){
                arr[tmp]=arr[tmp+1];
                tmp++;
                tmp2--;
            }
           index--;
        }
        else{
            System.out.println("No element at given index(default = 0)");
        }
    }

    public int ListSize(){
        return arr.length;
    }
     
    public void increaseListSize(){
        arr = Arrays.copyOf(arr, arr.length*2);
    }

    public void printList(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public int get(int ind){
      if(ind<index){
        return arr[ind];
      }
      else{
       System.out.println("No element at given index(default = 0)");
       return 0;
      }
    }
}


public class main {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);
       al.add(5);
       al.printList();
       al.remove(2);
       al.printList();
       al.add(6);
       al.printList();
       al.remove(2);
       al.printList();
   


       
    }
}
