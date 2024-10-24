package q2;

import java.util.ArrayList;

public class MatrixRunner {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);

        matrix.set(0, 0, "Start");
        matrix.set(1, 1, "Middle");
        matrix.set(2, 2, "End");

        System.out.println("Description at (1, 1): " + matrix.get(1, 1));

        ArrayList<Matrix.Cell> describedCells = matrix.getDescribedCells();
        System.out.println("Described Cells:");
        for (Matrix.Cell cell : describedCells) {
            System.out.println(cell + ": " + matrix.get(cell.getRow(), cell.getColumn()));
        }
    }
}
