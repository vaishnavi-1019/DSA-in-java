import java.util.HashMap;
import java.util.Scanner;

public class NumberHashBetter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precount
        HashMap<Integer,Integer>mp= new HashMap<> ();
        for(int i=0;i<n;i++){
            int key=arr[i];
            int freq=0;
            if(mp.containsKey(key)) freq = mp.get(key);
            freq++;
            mp.put(key,freq);
        }

            int q;
            System.out.println("Enter number of queries:");
            q = sc.nextInt();
            while (q-- != 0) {
                int number;
                System.out.println("Enter query:");
                number = sc.nextInt();
                // fetch:
                if (mp.containsKey(number)) System.out.println(mp.get(number));
                else System.out.println(0);
            }
         sc.close();
    }
}
