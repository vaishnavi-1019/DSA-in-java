import java.util.Scanner;
public class digitCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();

        int ld;
        int res=0;
        while(n>0){
            ld=n%10;
            res++;
            n/=10;
        }
        System.out.println("result:"+res);
        sc.close();
    }
}
