import java.util.Scanner;
public class NumberHashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precount
        int[] hash=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]] += 1;
        }

        //fetch
        int q;
        System.out.println("Enter number of query:");
        q=sc.nextInt();
        while(q-- !=0){
            int number=sc.nextInt();
            System.out.println(hash[number]);
        }
        sc.close();
    }
}
