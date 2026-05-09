class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int no_layers = Math.min(rows,cols) / 2;
        for(int layer = 0; layer<no_layers; layer++){

            List<Integer> r = new ArrayList<>();
            List<Integer> c = new ArrayList<>();
            List<Integer> val = new ArrayList<>();

            for(int i=layer; i<rows - layer -1; ++i){
                r.add(i);
                c.add(layer);
                val.add(grid[i][layer]);
            }

            for(int j=layer; j<cols - layer -1; ++j){
                r.add(rows-layer-1);
                c.add(j);
                val.add(grid[rows-layer-1][j]);
            }
              
             for(int i = rows - layer -1; i > layer ; --i){
                r.add(i);
                c.add(cols - layer -1);
                val.add(grid[i][cols - layer -1]);
            } 

             for(int j= cols - layer -1; j >layer ; --j){
                r.add(layer);
                c.add(j);
                val.add(grid[layer][j]);
            }
        int total = val.size();
        int kk = k % total;

        for(int i =0; i<total; ++i){
            int ind = (i+total-kk) % total;
            grid[r.get(i)][c.get(i)] = val.get(ind);
        }
    }
        return grid;
    }
}