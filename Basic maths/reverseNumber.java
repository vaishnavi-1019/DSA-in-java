import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int ld;
        int res=0;
        while(n>0){
            ld=n%10;
            res=(res * 10)+ld;
            n/=10;
        }
        System.out.println("reverse:"+res);
        sc.close();
    }
}
