import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=s.nextInt();

        int space=n/2;
        int star=n/2+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=star; j++)
                System.out.print("* ");
            for(int j=1; j<=space; j++)
                System.out.print("  ");
            for(int j=1; j<=star; j++)
                System.out.print("* ");

            if(i<(n/2+1)){
                space+=2;
                star--;
            }else{
                space-=2;
                star++;
            }
            System.out.println();
        }
        s.close();
    }
}
