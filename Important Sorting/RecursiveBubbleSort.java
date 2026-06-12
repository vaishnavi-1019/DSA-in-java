import java.util.Scanner;
public class RecursiveBubbleSort {
    public static void bubblesort(int[] arr,int n){
        if(n==1) return ;
        boolean didswap=false;
        for(int j=0;j<n-2;j++){
            if(arr[j] > arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                didswap=true;
            }
        }
        if(!didswap){
            return;
        }
        bubblesort(arr, n-1);
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
        bubblesort(arr, n);

         //printing array
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        sc.close();

    }
}
