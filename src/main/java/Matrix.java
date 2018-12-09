public class Matrix {
    private int[][] matrix;
    private int rowCount;
    private int columnCount;
    
    Matrix(int[][] matrix) {
        this.matrix = matrix;

        this.rowCount = matrix.length;
        this.columnCount = matrix[0].length;
    }
    
    public int[][] getMatrix() {
        return this.matrix;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public int countElementsWithValueBiggerThanIndexSum() {
        int elements = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > (i+j)) elements++;
            }
        }
        
        return elements;
    }
    
    
    public int[][] swapRows(int k1, int k2) {
        if (k1 >= rowCount || k2 >=  rowCount || k1 < 0 || k2 < 0) throw new ArrayIndexOutOfBoundsException();
        
        int[] tempRow = matrix[k1];
        int[][] newMatrix = matrix.clone();
        newMatrix[k1] = newMatrix[k2];
        newMatrix[k2] = tempRow;
        
        return newMatrix;
    }
    
    public String toString() {
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res.append(matrix[i][j]);
                res.append("\t");
            }
            res.append("\n");
        }
        
        return res.toString();
    }

    public static boolean isSquareMarix(int[][] matrix){
        if (matrix == null) return false;

        if (matrix.length == 0) return false;

        return  matrix.length == matrix[0].length;
    }
}
