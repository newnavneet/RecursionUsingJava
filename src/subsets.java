

import java.util.Scanner;

public class subsets {
    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();

        subset(arr,0,k,0,"");

    }

    public static void subset(int[] arr,int ind,int tar,int sum,String ans){
        if(ind==arr.length){
            if(sum==tar){
                System.out.println(ans);
            }
            return;
        }
        subset(arr,ind+1,tar,sum,ans);
        subset(arr,ind+1,tar,sum+arr[ind],arr[ind]+" "+ans);

    }

}

