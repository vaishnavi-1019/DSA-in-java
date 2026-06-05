import java.util.Scanner;
public class reverseArray {
    public static void reverseHelp(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        reverseHelp(arr, left+1, right-1);
    }

    public static void reverseArr(int[] arr,int n){
        reverseHelp(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("reversed array is:");
        reverseArr(arr, n);
        sc.close();
    }
}