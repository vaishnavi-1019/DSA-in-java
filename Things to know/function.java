import java.util.Scanner;
public class function {
    static  void reverseArray(int[] arr){
        int start = 0;
        int last = arr.length-1;

        while(start < last ){
            int temp = arr[start];
            arr[start]=arr[last];
            arr[last]=temp;

            start++;
            last--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
    sc.close();
    }
}
