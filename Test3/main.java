import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=0;
        int value=nums[target];
        if(target==0){
            int temp=target;
            int left=0;
            int right=nums[++temp];
            result=left+value+right;
            return result;
        }
        else if(target==nums.length-1){
             int temp=target;
            int left=nums[--temp];
            int right=0;
            result=left+value+right;
            return result;
        }
        else{
            int temp=target;
            int temp2=target;
            int left=nums[--temp];
            int right=nums[++temp2];
            result=left+value+right;
             return result;
        }
       


    }
}
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
                int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution sol=new Solution();
        try{int result=sol.threeSumClosest(nums,target);
            System.out.println(result);}
        catch(Exception e){
         System.out.println(e);
        }
       
    }
}