import java.util.Scanner;
public class SumTillN {
    
    public static int SumN(int n){
        if(n==1){
            return 1;
        }
        return n + SumN(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int res=SumN(n);
        System.out.println(res);
        sc.close();
    }
}
