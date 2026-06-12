import java.util.Scanner;
public class RecursiveInsertion {
    public static void insertionsort(int[] arr,int i,int n){
        if ( i==n) return;
        int j=i;
        while (j>0 && arr[j-1]>arr[j]) {
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        insertionsort(arr, i+1, n);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        insertionsort(arr, 0, n);

        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
