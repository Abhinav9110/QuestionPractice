package CampusMonk;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        int perfect=n;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(perfect==sum){
            System.out.println("Yes,Perfect Number");
        }else{
            System.out.println("No,Perfect Number");
        }

    }
}
