import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=5;
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    
}
