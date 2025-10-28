package CampusMonk;
import java.util.*;
public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        int sum=0;
        while(n >0){
            fact=fact*n;
//            sum+=fact;
            n--;
        }
        System.out.println("Fcatorial OF Number is "+fact);

    }
}
