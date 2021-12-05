package Getting_Started;
import java.util.Scanner;
public class PrimeNums_TillN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Lower limit: ");
        int low=s.nextInt();
        System.out.println("Higher limit: ");
        int high=s.nextInt();
        for(int i=low; i<=high; i++){
            boolean isPrime=true;
            for(int j=2; j<=(int)(Math.sqrt(i)); j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime)
                System.out.println(i);
        }
    }
}
