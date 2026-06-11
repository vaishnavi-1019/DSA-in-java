import java.util.Scanner;
public class characterHash {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string :");
        String s=sc.nextLine();

        //precompute 
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a']+=1;
        }

        //fetch
        System.out.println("Enter number of query:");
        int q=sc.nextInt();
        while(q-- != 0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
        sc.close();
    }
}
