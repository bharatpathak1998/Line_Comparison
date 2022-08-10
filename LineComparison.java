package UC4;

import java.util.Scanner;

public class LineComparison {
    public void equalsMethod(Double length1, Double length2) {
        if (length1.equals(length2)) {
            System.out.println("Both the lines are equal");
        } else {
            System.out.println("lines are not equal");
        }
    }
    public void compareToMethod(Double length1, Double length2) {
        int compare = length1.compareTo(length2);
        if (compare < 0) {
            System.out.println("Length of first line is less than length of second line");
        } else if (compare > 0) {
            System.out.println("Length of first line is greater than length of second line");
        } else {
            System.out.println("Both the lines are equal");
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

        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length Of First Line : " + length1);

        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length Of Second Line : " + length2);

        LineComparison obj = new LineComparison();

        obj.equalsMethod(length1, length2);
        obj.compareToMethod(length1, length2);
    }
}
