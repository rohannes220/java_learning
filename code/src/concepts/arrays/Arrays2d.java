package concepts.arrays;

public class Arrays2d {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 2, 3, 11, 12 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(arr[0][1]); // 2
        System.out.println(arr[0][3]); // 11

        int[][] arr2 = new int[2][5]; // {{1, 2, 3, 4, 5}, {4, 5, 6, 7, 17}};
        System.out.println(arr2[1][3]);
    }

}
