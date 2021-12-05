package Getting_Started;
import java.util.Scanner;
public class inverseOfANumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        int place=1; 
        int inverse=0;
        while(n>0){
            // int digit=n%10;
            inverse+=place*(int)(Math.pow(10, (n%10)-1));
            place++;
            n/=10;
        }
        System.out.println(inverse);
        s.close();
    }
}
