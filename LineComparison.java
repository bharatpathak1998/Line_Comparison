package UC2;

import java.util.Scanner;

public class LineComparison {
    static void checkEquality(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        Double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length Of First Line : "+length1);

        Double length2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
        System.out.println("Length Of Second Line : "+length2);

        if (length1.equals(length2)) {
            System.out.println("Both the lines are equal");
        } else {
            System.out.println("lines are not equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates for length of first line");
        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1 : ");
        int y1 = sc.nextInt();
        System.out.print("x2 : ");
        int x2 = sc.nextInt();
        System.out.print("y2 : ");
        int y2 = sc.nextInt();

        System.out.println("Enter the co-ordinates for length of second line");
        System.out.print("x3 : ");
        int x3 = sc.nextInt();
        System.out.print("y3 : ");
        int y3 = sc.nextInt();
        System.out.print("x4 : ");
        int x4 = sc.nextInt();
        System.out.print("y4 : ");
        int y4 = sc.nextInt();
        checkEquality(x1, y1, x2, y2, x3, y3, x4, y4);
    }
}
