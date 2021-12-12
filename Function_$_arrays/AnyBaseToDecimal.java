import java.util.Scanner;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int nBase=input_numBase();
        int num=input_num();
        System.out.println(convert(nBase, num));
    }
    public static int input_numBase(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base of the number: ");
        int nBase = s.nextInt();
        return nBase;
    }
    public static int input_num(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        return n;
    }
    public static int convert(int nBase, int n){
        int result = 0, power = 0;
        while(n>0){
            result+=(n%10)*(int)(Math.pow(nBase, power));
            n/=10;
            power++;
        }
        return result;
    }
}
