import java.util.Scanner;
public class Digit_Frequency {
    public static void main(String[] args) {
        int num = input_num();
        int digit = input_digit();
        System.out.println("Frequency of " + digit + " is " + (find_frequency(num, digit)));
    }
    public static int input_num(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        return n;
    }
    public static int input_digit(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = s.nextInt();
        return n;
    }
    public static int find_frequency(int n, int d){
        int frequency=0;
        while(n>0){
            if(n%10 == d)
                frequency++;
                
            n/=10;
        }

        return frequency;
    }
}
