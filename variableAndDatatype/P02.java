package variableAndDatatype;
// calculate the area
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter one side length: ");
        float side = sc.nextFloat();
        float area = calSqr(side);

        System.out.println("The area is :" + area);
    }

    static float calSqr(float side) {
        return side * side;
    }

}
