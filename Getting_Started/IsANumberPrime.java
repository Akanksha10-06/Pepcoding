package Getting_Started;
import java.util.Scanner;
public class IsANumberPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        boolean isPrime=true;
        for(int i=2; i<=(int)(Math.sqrt(n)); i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime)
            System.out.println("The number is Prime");
        else
            System.out.println("The number is not prime");
    }
}
