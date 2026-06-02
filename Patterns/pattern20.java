import java.util.Scanner;
public class pattern20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n=sc.nextInt();

        //upper 
        for(int i=0;i<n;i++){
            //left half pyramid 
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            //spaces 
            for(int j=1;j<=2*(n-i-1);j++){
                System.out.print(" ");
            }

            //right half pyramid 
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower 
        for(int i=n-2;i>=0;i--){

            //left half pyramid 
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }

            //spaces 
            for(int k=1;k<=2*(n-i-1);k++){
                System.out.print(" ");
            }

            //right trio
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    sc.close();
    }
}