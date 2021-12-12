import java.util.Scanner;
public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        int iBase=initial_base();
        int num=number();
        int resBase=result_base();
        int decimalBaseNumber = AnyBaseToDecimal(iBase, num);
        int result = DecimalToAnyBase(resBase, decimalBaseNumber);
        System.out.println(result);
    }
    public static int initial_base(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base of the number: ");
        int n = s.nextInt();
        return n;
    }
    public static int number(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        return n;
    }
    public static int result_base(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the destination base: ");
        int n = s.nextInt();
        return n;
    }
    public static int AnyBaseToDecimal(int b, int n){
        int result = 0, power = 0;
        while(n>0){
            result+=(n%10)*(int)(Math.pow(b, power));
            n/=10;
            power++;
        }
        return result;
    }
    public static int DecimalToAnyBase(int b, int n){
        int res=0, power=0;
        while(n>0){
            res = (n%b)*(int)(Math.pow(10, power))+res;
            n/=b;
            power++;
        }
        return res;
    }
}
