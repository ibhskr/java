package variableAndDatatype;

// Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3
// numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();
        calAvg(a, b, c);
    }

    public static void calAvg(int a, int b, int c) {
        System.out.println((a + b + c) / 3);
    }

}
