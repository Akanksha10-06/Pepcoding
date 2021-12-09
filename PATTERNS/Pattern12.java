import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        int num1=0, num2=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num1+" ");
                int sum=num1+num2;
                num1=num2;
                num2=sum;
            }
            System.out.println();
        }
    }
}
