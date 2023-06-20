import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int j;
        int[] arr=new int[5];
        for( i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for( i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
      int size=max+1;

      int[] count=new int[size];
     
        for( j=0;j<arr.length;j++){
            count[arr[j]]=count[arr[j]]+1;
        }

    
      
 i=0;//for count
 j=0;//for main
        while(i<max+1){
            if(count[i]>0){
                arr[j]=i;
                count[i]=count[i]-1;
                j++;
            }
            else{
                i++;
            }
        }

        for( int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}
