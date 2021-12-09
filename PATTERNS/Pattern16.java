import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numebr of rows: ");
        int n = s.nextInt();
        int space = (2*n)-3;
        int star = 1;
        for(int i = 1; i <= n; i++){
            int out1 = 1;
            for(int j=1; j<=star; j++){
                System.out.print(out1 + " ");
                out1++;
            }
            for(int j=1; j<=space; j++)
                System.out.print("  ");
            
            
            if(i!=n){
                int out2=out1-1;
                for(int j=1; j<=star; j++){
                    System.out.print(out2 + " ");
                    out2--;
                }
            }
            else{
                int out2=out1-2;
                for(int j=1; j<=star-1; j++){
                    System.out.print(out2 + " ");
                    out2--;
                }
            }
            space-=2;
            star++;
            System.out.println();
        }
    }
}
