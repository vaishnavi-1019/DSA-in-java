import java.util.HashMap;
import java.util.Scanner;
public class HighestFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precount
        HashMap<Integer,Integer>mp = new HashMap<>();
        int maxKey=0;
        int maxFreq=0;
        for(int i=0;i<n;i++){
            int key=arr[i];
            int freq=0;

            if(mp.containsKey(key)) freq=mp.get(key);
            freq++;
            mp.put(key,freq);

            if(freq > maxFreq){
                maxFreq = freq;
                maxKey=key;
            }
            else if(freq == maxFreq  && key < maxKey){
                maxKey=key;
            }
        }
        System.out.println(maxKey);
        sc.close();
    }
}
