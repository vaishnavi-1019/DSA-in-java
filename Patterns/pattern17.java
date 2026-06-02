import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();

         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            char ch='A';
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(ch);
                if(k<i){
                    ch++;
                }
                else{
                    ch--;
                }
            }
             System.out.println();
        }
        sc.close();
    }
}
