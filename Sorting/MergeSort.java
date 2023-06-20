

public class MergeSort {

    public static void conquer(int arr[],int si,int mid,int ei){

        int merged[]=new int[ei- si + 1];

        int indx1=si;
        int indx2=mid+1;;
        int i=0;

        System.out.println("SI --> "+si);
        System.out.println("MID --> "+mid);
        System.out.println("EI --> "+ei);
        System.out.println("Arr Length --> "+merged.length);

        while(indx1<=mid&&indx2<=ei){
            if(arr[indx1]<=arr[indx2]){
                merged[i++]=arr[indx1++];

            }
            else{
                merged[i++]=arr[indx2++];
            }
        }
        while(indx1<=mid){
            merged[i++]=arr[indx1++];
        }
        while(indx2<=ei){
            merged[i++]=arr[indx2++];
        }

        for(int idx=0,j=si;idx<merged.length;idx++,j++){
          arr[j]=merged[idx];
        }

    }


    public static void divide(int arr[],int si,int ei){
         if(si>=ei){
            return;
         }
          int mid = si+(ei-si)/2;
         divide(arr, si, mid);
         divide(arr, mid+1, ei);
         conquer(arr,si,mid,ei);
        
       
            
    }
    public static void main(String[] args) {

        int[] arr={22,4,6,8,1};
    
        int n=arr.length;

        divide(arr,0,n-1);


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();




    }
}
