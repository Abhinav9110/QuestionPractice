package CampusMonk;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=n;
        int rev=0;
        while(n >0){
           int d=n%10;
           rev=rev*10+d;
           n/=10;
        }
        System.out.println("Reverse numver is : "+rev);
    }
}
