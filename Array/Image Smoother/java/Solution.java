class Solution {
    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] result = new int[rows][cols];
        
        // Iterate over every pixel in the image
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int sum = 0;
                int count = 0;
                
                // Scan the 3x3 surrounding neighborhood
                for (int i = r - 1; i <= r + 1; i++) {
                    for (int j = c - 1; j <= c + 1; j++) {
                        // Check if the neighbor is within the matrix boundaries
                        if (i >= 0 && i < rows && j >= 0 && j < cols) {
                            sum += img[i][j];
                            count++;
                        }
                    }
                }
                
                // Integer division automatically rounds down for positive numbers
                result[r][c] = sum / count;
            }
        }
        
        return result;
    }
}
