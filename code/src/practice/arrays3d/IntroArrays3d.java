package practice.arrays3d;

public class IntroArrays3d {
    public static void main(String[] args) {
        int[][] arr2d = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        System.out.println(arr2d[0][2]);

        int[][][] arr3d = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 }
                },
                {
                        { 11, 12, 13 },
                        { 14, 15, 16 }
                },
                {
                        { 21, 22, 23 },
                        { 24, 25, 26 }
                }
        };
        System.out.println(arr3d[2][0][1]);

        int[][] x = arr3d[0];
        int numRows = x.length;
        int numCols = x[0].length;

        System.out.println('[');
        for (int i = 0; i < numRows; i++) {
            System.out.print("    [ ");
            for (int j = 0; j < numCols; j++) {
                System.out.print(x[i][j]);
                System.out.print(" ");

            }
            System.out.println("]");
        }
        System.out.println(']');
    }
}
