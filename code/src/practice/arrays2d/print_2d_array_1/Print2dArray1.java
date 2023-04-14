package practice.arrays2d.print_2d_array_1;

public class Print2dArray1 {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3, 4, 5 }, // 0
                { 3, -4, 11, 5, 6 }, // 1
                { 4, 5, 7, 9, 11 } // 2
        };
        int numRows = array.length;
        int numCols = array[0].length;

        System.out.println('{');
        for (int i = 0; i < numRows; i++) {
            System.out.print("    {");
            for (int j = 0; j < numCols; j++) {
                System.out.print(array[i][j]);
                if (j != numCols - 1) {
                    System.out.print(", ");
                }
            }
            if (i == numRows - 1) {
                System.out.println("}");
            } else {
                System.out.println("},");
            }
        }
        System.out.println('}');
    }
}
