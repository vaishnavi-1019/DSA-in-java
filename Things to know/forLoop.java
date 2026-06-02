import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lowest limit:");
        int low = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter highest limit:");
        int high = sc.nextInt();

        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=i;
        }
        System.out.println("sum:"+sum);
        sc.close();
    }
}
