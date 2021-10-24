import java.util.Scanner;

public class DrawRightTriangle {
    public static void main(String[] args) {
        //create Scanner for inputs and variables to store the triangle's height and symbol to print
        Scanner scnr = new Scanner(System.in);
        String triangleSymbol;
        int triangleHeight;
        System.out.println("Enter a symbol:");
        triangleSymbol = scnr.next();
        System.out.println("Enter triangle height:");
        triangleHeight = scnr.nextInt();
        System.out.println(); //blank line before triangle output

        //TODO: Draw right triangle
        int intCount = triangleHeight;
        for (int x = 1; x <= triangleHeight; x++) {
            for (int y = 1; y <= intCount; y++) {
                System.out.print(triangleSymbol);
            }

            System.out.println(""); //ends the current line to move on to the next line
            intCount--;
        }
    }

}

