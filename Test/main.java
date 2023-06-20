import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res=0;
        
        int[] a3=new int[nums1.length+nums2.length];
        
        for(int i=0;i<nums1.length;i++){
            a3[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            a3[nums1.length+i]=nums2[i];
        }
        
        for(int i=0;i<a3.length-1;i++){
            for(int j=0;j<a3.length-i-1;j++){
                if(a3[j]>a3[j+1]){
                    int temp=a3[j];
                    a3[j]=a3[j+1];
                    a3[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a3.length;i++){
        System.out.print(a3[i]+" ");
        }
        
        if(a3.length%2!=0){
            int value=a3.length/2;
            res=res+a3[value];
        }
        else{
            int value=a3.length/2;
            int v1=a3[value-1];
            int v2=a3[value];
            float a=((float)v1+v2)/2;
            res=res+a;
        }
        
        return res;
        
        
    }
}

public class main{
    public static void main(String[] args){
      Solution s=new Solution();
     Scanner sc=new Scanner(System.in);
        
        int[] a1=new int[2];
        int[] a2=new int[2];
        
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }
        

        double res=s.findMedianSortedArrays(a1,a2);
        
        System.out.println(res);
        
    }
}