package CampusMonk;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int digit=0;
        double abs=0;
        int a=n;
        int b=n;
        while(a >0){
            digit++;
            a/=10;
        }
        while(b >0){
            int c=b%10;
             abs+=Math.pow(c,digit);
             b/=10;
        }
        if(abs==n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
