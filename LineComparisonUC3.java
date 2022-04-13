import java.util.Objects;
import java.util.Scanner;

public class LineComparisonUC3 {

    static int x1;
    static int y1;
    static int x2;
    static int y2;

    static double length;
    static double length1;
    static double length2;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparisonUC3 line3 = new LineComparisonUC3();

        System.out.println("Enter the co-ordinates(x1,x2)&(y1,y2) for Line 1");
        line3.inputCoordinates();
        length1 = line3.calLength();
        System.out.println("Length of the Line 1 is: "+length);

        System.out.println("Enter the co-ordinates(x1,y1)&(x2,y2) for Line 2");
        line3.inputCoordinates();
        length2 = line3.calLength();
        System.out.println("Length of the Line 2 is: "+length);

        line3.lineComparison();

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

    public double calLength() {

        length = Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
        return length;
    }

    public void lineComparison() {
        if (length1 == length2) {
            System.out.println("Lines are equal");
        }
        else if(length1 > length2){
            System.out.println("Line1 is greater than Line2");
        }
        else {
            System.out.print("Line2 is greater than Line1");
        }
    }
}
