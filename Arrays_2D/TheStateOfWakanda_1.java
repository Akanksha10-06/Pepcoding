package Arrays_2D;
import java.util.Scanner;
public class TheStateOfWakanda_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Number of rows: ");
        int n=s.nextInt();
        System.out.println("Number of columns: ");
        int m=s.nextInt();
        int[][] a=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j]=s.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    System.out.println(a[j][i]);
                }
            }else{
                for(int j=n-1; j>=0; j--){
                    System.out.println(a[j][i]);
                }
            }
        }
    }

}
