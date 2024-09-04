package variableAndDatatype;

import java.util.Scanner;

// calculate 3 items bill and add 18% gst
public class P03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item 1 price:");
        float i1 = sc.nextFloat();
        System.out.print("Enter item 1 price:");
        float i2 = sc.nextFloat();
        System.out.print("Enter item 1 price:");
        float i3 = sc.nextFloat();
        calBill(i1, i2, i3);
    }

    static void calBill(float a, float b, float c) {
        float totalBill = (a + b + c) * 118 / 100;
        System.out.println(totalBill);
    }

}
