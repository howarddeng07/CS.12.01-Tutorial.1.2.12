public class Successors {

    public static Position findPosition(int value, int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == value) {
                    return new Position(r, c);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr) {
        Position[][] successorArray = new Position[arr.length][arr[0].length];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                int successorValue = arr[r][c] + 1;
                successorArray[r][c] = findPosition(successorValue, arr);
            }
        }
        return successorArray;
    }
}