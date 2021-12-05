package Getting_Started;
import java.util.Scanner;
public class FibonacciSeries_TillN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n=s.nextInt();
        int num1=0;
        int num2=1;
        System.out.println(num1 + "\n" + num2);
        int sum=0;
        for(int i=3; i<=n; i++){
            sum=num1+num2;
            System.out.println(sum);
            num1=num2;
            num2=sum;
        }
    }
}
