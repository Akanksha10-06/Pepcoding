import java.util.Scanner;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        int number = input_num();
        int base = input_base();
        System.out.println(convert(number, base));
    }

    public static int input_num(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        return n;
    }

    public static int input_base(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base to which the num is to be converted: ");
        int base = s.nextInt();
        return base;
    }

    public static int convert(int num, int base){
        int res=0, power=0;
        while(num>0){
            res = (num%base)*(int)(Math.pow(10, power))+res;
            num/=base;
            power++;
        }
        return res;
    }
}
