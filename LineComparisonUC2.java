import java.util.Objects;
import java.util.Scanner;

public class LineComparisonUC2 {

    static int x1;
    static int y1;
    static int x2;
    static int y2;

    static double length;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparisonUC2 line2 = new LineComparisonUC2();

        System.out.println("Enter the co-ordinates(x1,x2)&(y1,y2) for Line 1");
        line2.inputCoordinates();
        double length1 = line2.calLength();
        System.out.println("Length of the Line 1 is: "+length);

        System.out.println("Enter the co-ordinates(x1,y1)&(x2,y2) for Line 2");
        line2.inputCoordinates();
        double length2 = line2.calLength();
        System.out.println("Length of the Line 2 is: "+length);

        if (Objects.equals(length1, length2)) {
            System.out.println("Lines are equal");
        }
        else {
            System.out.println("Lines unequal");
        }
    }

    public double calLength() {

        length = Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
        return length;
    }

    public void inputCoordinates() {

        Scanner scan = new Scanner(System.in);
        x1 = scan.nextInt();
        y1 = scan.nextInt();

        x2 = scan.nextInt();
        y2 = scan.nextInt();

        System.out.println("(" +x1+ "," +y1+ ")");
        System.out.println("(" +x2+ "," +y2+ ")");
    }
}
