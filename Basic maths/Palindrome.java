import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int ld;
        int res=0;
        int temp=n;

        while(n>0){
            ld=n%10;
            res=(res*10)+ld;
            n/=10;
        }
        if(temp==res){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
