package practice.arrays2d.print_2d_array_2;

public class Print2dArray2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 }, // 0
                { 3, -4, 11, 5, 6 }, // 1
                { 4, 5, 7, 9 }, // 2
                { 4, 5, 7, 99, 777, -82 }, // 3
        };

        int numRows = arr.length;

        System.out.println('{');
        for (int i = 0; i < numRows; i++) {
            int numCols = arr[i].length;

            System.out.print("    {");
            for (int j = 0; j < numCols; j++) {
                System.out.print(arr[i][j]);
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
