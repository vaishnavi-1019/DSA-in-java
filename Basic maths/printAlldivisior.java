import java.util.ArrayList;
import java.util.Scanner;
public class printAlldivisior {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }

        System.out.println(list);
        sc.close();
    }
}
