import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=n-i;j++){

                System.out.print(" ");
            }


            //patterns
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
