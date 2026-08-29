class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int rep = 0;
    int sum = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            sum += grid[i][j];
            if (set.contains(grid[i][j])) {
                rep = grid[i][j];
            }
            set.add(grid[i][j]);
        }
    }
    int n = grid.length * grid.length;
    int expected = n * (n + 1) / 2;
    int miss = expected - sum + rep;
    return new int[]{rep, miss};
    }
}