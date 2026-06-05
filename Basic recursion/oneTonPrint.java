import java.util.Scanner;
public class oneTonPrint {
    public static void printNumber(int n){
        print(1,n);
    }

    public static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1,n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        printNumber(n);
        sc.close();
    }
}
