package CampusMonk;
import java.util.*;
public class PrimeNumber {
    static boolean isPrime(int n) {
        // code here
        if(n<=1) return false;
        int count=0;
        for(int i=2;i<n;i++){
            if(n %i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }
}
