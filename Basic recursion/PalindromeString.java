import java.util.Scanner;

public class PalindromeString{

    public static boolean check(String s){
       return helper(s,0,s.length()-1);
    }

    public static boolean helper(String s,int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return helper(s,i+1,j-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= sc.nextLine();
        System.out.println(check(s));
        sc.close();

    }
}