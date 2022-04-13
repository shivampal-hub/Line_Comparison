import java.util.Scanner;

public class LineComparisonUC1 {

    static int x1;
    static int y1;
    static int x2;
    static int y2;

    static double length;

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter the value of x and y Co-ordinates of two points.");

        LineComparisonUC1 line = new LineComparisonUC1();
        line.calLength();
        System.out.println("Length of the line is: "+length);

    }
    public double calLength() {

        Scanner scan = new Scanner(System.in);
        x1 = scan.nextInt();
        y1 = scan.nextInt();

        x2 = scan.nextInt();
        y2 = scan.nextInt();

        System.out.println("(" +x1+ "," +y1+ ")");
        System.out.println("(" +x2+ "," +y2+ ")");

        length = Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
                return length;
    }
}
