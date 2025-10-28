package CampusMonk;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int x=n;
        int rev=0;
        while(n >0){
            int d=n%10;
            rev=rev*10+d;
             n=n/10;

        }
        if(x==rev){
            System.out.println("Yes,entered Number is Palindrome Number");
        }else{
            System.out.println("Sorry,entered Number is not Plaindrome number");
        }
    }
}
