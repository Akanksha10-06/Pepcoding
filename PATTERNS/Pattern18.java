import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        int out_space=1,
            in_space=n-4;
        int first_space=n/2,
            star=1;
        for(int i = 1; i <= n; i++){
            if(i==1){
                for(int j=1; j<=n; j++)
                    System.out.print("* ");
            }
            else if(i>=2 && i<=(n/2)){
                for(int j=1; j<=out_space; j++)
                    System.out.print("  ");

                System.out.print("* ");

                for(int j=1; j<=in_space; j++)
                    System.out.print("  ");

                System.out.print("* ");
                out_space++;
                in_space-=2;
            }
            else{
                for(int j=1; j<=first_space; j++)
                    System.out.print("  ");
                for(int j=1; j<=star; j++)
                    System.out.print("* ");
                first_space--;
                star+=2;
            }
            System.out.println();
        }

        s.close();
    }
}
