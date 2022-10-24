import java.util.Scanner;

public class Lab4 {
    static int a_x, a_y, b_x, b_y, c_x, c_y; // Coordinate
    static double dAB, dBC, dCA; // Distance
    static double sAB, sBC, sCA; // Slope
    static Scanner input = new Scanner(System.in);
    static final double EPSILON = 0.00000000000000000000000000000000000000000000000000000000000000000001;

    /**
     * Take x-coordinate and y-coordinate and check if they are in range [0, 40].
     * @param x x-coordinate
     * @param y y-coordinate
     * @return True if they are valid, else false.
     */
    public static boolean verifyCoordinate(int x, int y) {
        boolean valid = true;
        if (x < 0 || x > 40) valid = false;
        if (y < 0 || y > 40) valid = false;

        if (!valid) System.out.printf("Coordinate (%d, %d) is not in acceptable range.\n", x, y);
        return valid;
    }

    /**
     * Input coordinates and verify them.
     * @return True if all coordinates are valid, else false.
     */
    public static boolean getInput() {
        System.out.println("Enter the coordinates of triangle ABC");
        
        System.out.print("x-coordinate of A: ");
        a_x = input.nextInt();
        System.out.print("y-coordinate of A: ");
        a_y = input.nextInt();
    
        System.out.print("x-coordinate of B: ");
        b_x = input.nextInt();
        System.out.print("y-coordinate of B: ");
        b_y = input.nextInt();
    
        System.out.print("x-coordinate of C: ");
        c_x = input.nextInt();
        System.out.print("y-coordinate of C: ");
        c_y = input.nextInt();

        boolean valid = true;
        if (!verifyCoordinate(a_x, a_y)) valid = false;
        if (!verifyCoordinate(b_x, b_y)) valid = false;
        if (!verifyCoordinate(c_x, c_y)) valid = false;
        return valid;
    }

    /**
     * Calculate slope of 2 points as raise over run.
     * @param x1 First point x-coordinate
     * @param y1 First point y-coordinate
     * @param x2 Second point x-coordinate
     * @param y2 Second point y-coordinate
     * @return Slope of 2 points
     */
    public static double calculateSlope(int x1, int y1, int x2, int y2) {
        return (double)(y2 - y1) / (double)(x2 - y1);
    }

    /**
     * Check if 3 points are on the same line
     * @return True if points are on the same line, else false
     */
    public static boolean isLine() {
        sAB = calculateSlope(b_x, b_y, a_x, a_y);
        sBC = calculateSlope(c_x, c_y, b_x, b_y);
        sCA = calculateSlope(a_x, a_y, c_x, c_y);

        if (Math.abs(sAB - sBC) < EPSILON && Math.abs(sBC - sCA) < EPSILON) {
            System.out.println("Three points are on the same line.");
            return true;
        } else return false;
    }

    /**
     * Calculate distance between 2 points base on their coordinates.
     * @param x1 First point x-coordinate
     * @param y1 First point y-coordinate
     * @param x2 Second point x-coordinate
     * @param y2 Second point y-coordinate
     * @return The distance between first point and second point.
     */
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Calculate the triangle perimeter.
     * @return Triangle perimeter
     */
    public static double calculatePerimeter() {
        dAB = calculateDistance(a_x, a_y, b_x, b_y);
        dBC = calculateDistance(b_x, b_y, c_x, c_y);
        dCA = calculateDistance(c_x, c_y, a_x, a_y);

        return dAB + dBC + dCA;
    }

    /**
     * Calculate the triangle area.
     * @return Triangle area.
     */
    public static double calculateArea() {
        double s = calculatePerimeter() / 2;

        return Math.sqrt(s * (s - dAB) * (s - dBC) * (s - dCA));
    }

    public static void main(String args[]) {
        boolean repeat;

        do {
            // Get and check if the coordinates are valid befor continue calculate.
            if (getInput()) {
                // Check if 3 points are on the same line, if not then continue calculate.
                if (!isLine()) {
                    // Display coordinates
                    System.out.printf("Triangle: A(%d,%d), B(%d,%d), and C(%d, %d)\n", a_x, a_y, b_x, b_y, c_x, c_y);

                    // Display perimeter
                    System.out.println("Perimeter: " + calculatePerimeter());

                    // Display area
                    System.out.println("Area: " + calculateArea());
                }
            }

            // Repeat program
            System.out.print("Would you like to repeat the program (1 for yes, 2 for no)? ");
            int answer = input.nextInt();
            if (answer == 1) repeat = true;
            else {
                System.out.println("End of the program.");
                repeat = false;
            }
        } while(repeat);
    }
}
