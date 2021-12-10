import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        int space=n/2;
        int star=1;
        for(int i=1; i<=n; i++){
            if(i!=(n/2)+1)
                for(int j=1; j<=space; j++)
                    System.out.print("  ");
            else
                for(int j=1; j<=space; j++)
                System.out.print("* ");
            for(int j=1; j<=star; j++)
                System.out.print("* ");

            if(i<(n/2)+1)
                star++;
            else
                star--;

            System.out.println();
        }
    }
}
