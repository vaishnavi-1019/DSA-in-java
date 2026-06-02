import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n=sc.nextInt();

        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(c);
                if(c==1){
                    c=0;
                }
                else{
                    c=1;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
