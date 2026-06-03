import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int ld,res=0;
        int temp=n;
        while(n>0){
            ld=n%10;
            res=res+(ld*ld*ld);
            n/=10;
        }
        if(temp==res){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        sc.close();
    }
}
