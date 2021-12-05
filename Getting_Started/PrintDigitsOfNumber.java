package Getting_Started;
import java.util.Scanner;
public class PrintDigitsOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        
        /* while(n>0){
            System.out.println(n%10);
            n/=10;
        }  */

        int nod=0;
        int temp=n;
        while(temp>0){
            nod++;
            temp/=10;
        }

        int div=(int)(Math.pow(10, nod-1));

        while(n>0){
            int out=n/div;
            System.out.println(out);
            n%=div;
            div/=10;
        }
    }
}
