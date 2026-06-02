//input take and so it 
import java.util.Scanner;
public class inputOutput{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        System.out.println("number is:"+n);
        sc.close();
    }
}