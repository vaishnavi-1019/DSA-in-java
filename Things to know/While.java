import java.util.Scanner;
public class While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int d=sc.nextInt();

        int i=1;
        int count=0;
        int sum=0;

        while(count<50){
            if(i%10 == d){
                sum+=i;
                count++;
            }
            i++;
        }
        System.out.println("Sum is:"+sum);
        sc.close();
    }
}
