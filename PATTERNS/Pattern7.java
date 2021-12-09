import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=s.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
