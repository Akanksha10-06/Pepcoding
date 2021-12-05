package Getting_Started;
import java.util.Scanner;
public class reverseANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }

        System.out.println(rev);
    }
}
