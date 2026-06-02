import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<=i;j++){   
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
