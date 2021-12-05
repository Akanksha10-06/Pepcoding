package Getting_Started;
import java.util.Scanner;
public class Print_Z {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any odd number: ");
        int n=s.nextInt();
        int space=n-2;
        for(int i=1; i<=n; i++){
            if(i==1||i==n){
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }    
            }else{
                for(int j=1; j<=space; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                space--;
            }
            System.out.println();
        }
    }
}
