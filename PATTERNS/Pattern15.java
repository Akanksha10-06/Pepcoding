import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        int space=n/2;
        int star=1;
        int starter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++) 
                System.out.print("  ");
            for(int j=1, out=starter; j<=star; j++){
                System.out.print(out + " ");
                if(j<=star/2)
                    out++;
                else   
                    out--;
            }
            if(i<(n/2)+1){
                space--;
                star+=2;
                starter++;
            }else{
                space++;
                star-=2;
                starter--;
            }
            System.out.println();
        }
    }
}
