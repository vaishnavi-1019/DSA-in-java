import java.util.Scanner;
import java.util.*;
public class MergeSort {
    public  static void merge(int[] arr,int low,int mid,int high){
       List<Integer>temp = new ArrayList<>();
        int left = low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }

        while(left<=mid){
            temp.add(arr[left++]);
        }

        while(right<=high){
            temp.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
           arr[i]=temp.get(i-low);
        }
    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr, low, mid, high);
    }


public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    //printing array
    System.out.println("before sort:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    mergeSort(arr,0,n-1);

    //printing array
    System.out.println("After sort:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    sc.close();
}
}