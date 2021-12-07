package Getting_Started;
import java.util.Scanner;
class Prime_Factorization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        
        for(int i=2; i<=Math.sqrt(n); i++){
            while(n%i==0){
                n=n/i;
                System.out.println(i);
            }
        }

        if(n!=1)
            System.out.println(n);

    }
}
