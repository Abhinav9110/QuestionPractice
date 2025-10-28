package CampusMonk;
import java.util.*;
public class LargestDingitInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int larg=0;
        while(n >0){
            int d=n%10;
            if(d >larg){
                larg=d;
            }
            n=n/10;
        }
        System.out.println("Largest Number in digit is "+larg);
    }
}
