public class CountSort {

    public static void countsort(int arr[],int n){
        
        // finding maximum element
        int max=arr[0];
        for(int i=1;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        // creating count array of length max+1
        int countArr[]=new int[max+1];
        
        // count of each element in original array in cout array
        for(int i=0;i<n;i++){
            countArr[arr[i]]++;
        }

        // comulative sum of count array
        for(int i=1;i<countArr.length;i++){
            countArr[i]+=countArr[i-1];
        }

        // new output array of same length as original array
        int out[]=new int[n];

        // Find the index of each element of the original array in the count array
        // This gives the cumulative count. Place the element at the index calculated
        for(int i=n-1;i>=0;i--){
            out[--countArr[arr[i]]]=arr[i];
        }

        // Copy into original array
        for(int i=0;i<n;i++){
            arr[i]=out[i];
        }
    }
    public static void main(String[] args) {
      int arr[]={5,4,3,2,1};
      int n=arr.length;

      countsort(arr,n);

      for(int i=0;i<n;i++){
        System.out.println(arr[i]);
      }
      
}
}
