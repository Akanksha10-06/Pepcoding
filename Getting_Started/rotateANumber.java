package Getting_Started;
import java.util.Scanner;
public class rotateANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        System.out.println("Enter the number by which the array is to be rotated: ");
        int k=s.nextInt();

        

        int temp=num;
        int nod=0;
        while(temp>0){
            nod++;
            temp/=10;
        }

        k%=nod;
        if(k<0){
            k+=nod;
        }


        int div=(int)(Math.pow(10, k));
        int mult=(int)(Math.pow(10, (nod-k)));
        int res=(num%div)*mult+(num/div);

        System.out.println(res);
    }
}
