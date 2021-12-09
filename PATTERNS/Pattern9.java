import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        int out_space=0, mid_space=(n/2)+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=out_space; j++)
                System.out.print("  ");
            System.out.print("* ");
            for(int j=1; j<=mid_space; j++)
                System.out.print("  ");
            
            if(i!=(n/2)+1)
                System.out.print("* ");

            if(i<(n/2)+1){
                out_space++;
                mid_space-=2;
            }else{
                out_space--;
                mid_space+=2;
            }
            System.out.println();
        }
    }
}
