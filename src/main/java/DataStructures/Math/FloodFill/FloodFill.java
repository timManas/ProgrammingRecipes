package DataStructures.Math.FloodFill;

public class FloodFill {

    static private int maxX = 8;
    static private int maxY = 8;

    public static void main(String [] args) {
        int [][] screen = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };

        int x = 4;
        int y = 4;
        int newColour = 8;

        floodFill(screen, x, y, newColour);

        // Display Results
        for (int i=0; i < screen.length; i++) {
            for (int j=0; j < screen[i].length; j++) {
                System.out.print(screen[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void floodFill(int[][] screen, int x, int y, int newColour) {
        int prevColour = screen[x][y];
        floodFillMatrix(screen, x, y, newColour, prevColour);
    }

    private static void floodFillMatrix(int[][] screen, int x, int y, int newColour, int prevColour) {

        // Check within Boundaries
        if (x < 0 || y < 0)
            return;

        // Check within boundaries of max Size
        if (x >= maxX || y >= maxY)
            return;

        // Check if current colour is NOT targetted colour
        if (screen[x][y] != prevColour)
            return;

        // Update the colour !!!
        screen[x][y] = newColour;

        // Traverse every direction !!
        floodFillMatrix(screen, x-1, y, newColour, prevColour);
        floodFillMatrix(screen, x+1, y, newColour, prevColour);
        floodFillMatrix(screen, x, y-1, newColour, prevColour);
        floodFillMatrix(screen, x, y+1, newColour, prevColour);
    }
}


/**
 Notes
 - Replace values in a matrix with a new value
 - Think of MS Paint Fill. It fills a selected space to be filled a specific colour
    > Same idea ...except in a matrix form
 */


