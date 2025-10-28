package CampusMonk;
import java.util.*;
public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int a=n;
        int count=0;
        while(n >0){
            int d=n%10;
            if(d%2!=0){
                count++;
            }
            n=n/10;
        }
        System.out.println("Number of odd Digits in "+a+"is: "+count);
    }
}
