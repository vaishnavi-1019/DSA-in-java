import java.util.Scanner;
public class GCD {
    public static int Findgcd(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }

        }

        if(n1==0){
            return n2;
        }
        else{
            return n1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();

        System.out.println("Enter second number:");
        int b=sc.nextInt();

        int res=Findgcd(a,b);
        System.out.println("gcd is:"+res);
        sc.close();
    }
}