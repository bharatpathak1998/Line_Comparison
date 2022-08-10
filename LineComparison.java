package UC1;

import java.util.Scanner;

public class LineComparison {
    public static double lengthOfLine(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
    public static void main(String[] args) {
        System.out.println("Enter The Value For Co-ordinates");
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 : ");
        int x1 = sc.nextInt();
        System.out.print("y1 : ");
        int y1 = sc.nextInt();
        System.out.print("x2 : ");
        int x2 = sc.nextInt();
        System.out.print("y2 : ");
        int y2 = sc.nextInt();
        System.out.println("Length of line : "+lengthOfLine(x1, y1, x2, y2));
    }
}