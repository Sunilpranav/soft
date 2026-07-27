class Solution {
    public int islandPerimeter(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // If the current cell is land
                if (grid[i][j] == 1) {

                    // Every land cell contributes 4 sides
                    perimeter += 4;

                    // Check Top
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter--;
                    }

                    // Check Bottom
                    if (i < rows - 1 && grid[i + 1][j] == 1) {
                        perimeter--;
                    }

                    // Check Left
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter--;
                    }

                    // Check Right
                    if (j < cols - 1 && grid[i][j + 1] == 1) {
                        perimeter--;
                    }
                }
            }
        }

        return perimeter;
    }
}