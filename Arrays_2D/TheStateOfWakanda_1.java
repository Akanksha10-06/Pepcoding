package Arrays_2D;
import java.util.Scanner;
public class TheStateOfWakanda_1 {
    public static void main(String[] args) {
        int[][] a=array_input();
        int n=a.length;
        int m=a[0].length;

        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<m; j++){
                    System.out.println(a[i][j]);
                }
            }else{
                for(int j=m-1; j>=0; j--){
                    System.out.println(a[i][j]);
                }
            }
        }
        
    }

    public static int[][] array_input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=s.nextInt();
        System.out.println("Enter number of cols: ");
        int m=s.nextInt();
        int[][] arr=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=s.nextInt();
            }
        }

        return arr;
    }

}
