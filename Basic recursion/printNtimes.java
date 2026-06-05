import java.util.Scanner;
public class printNtimes {

    public static void printntimes(int n){
        if(n<1){
            return;
        }
        System.out.println("vishu");
        printntimes(n-1);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();

        printntimes(n);
        sc.close();
    }
}