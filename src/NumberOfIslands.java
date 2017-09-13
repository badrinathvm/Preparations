/**
 * Created by Badri on 9/12/17.
 */
public class NumberOfIslands {

    public static void main(String[] args) {

//        char grid[][] = new char[][]{
//                {1, 1, 1, 1, 0},
//                {1, 1, 0, 1, 0},
//                {1, 1, 0, 0, 0},
//                {0, 0, 0, 0, 0}
//        };

        char grid[][] = new char[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        System.out.println(NumberOfIslands.numIslands(grid));

    }

    public static int numIslands(char [][] grid){

        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }

        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(isLand(grid,i,j)){
                    count ++;
                }
            }
        }

        return count;

    }

    static boolean isLand(char[][] grid, int i , int j){

        int m = grid.length;
        int n = grid[0].length;

        if(grid[i][j] == '1'){
            grid[i][j] ='x';

            if(i>=1){
                isLand(grid,i-1,j);
            }

            if(j>=1){
                isLand(grid,i,j-1);
            }

            if(j<n-1){
                isLand(grid,i,j+1);
            }

            if(i<m-1){
                isLand(grid,i+1,j);
            }

            return true;
        }

        return false;
    }




    public static void merge(char grid[][], int i , int j){

        int m = grid.length;
        int n = grid[0].length;

        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] != '1')
            return ;

        grid[i][j] ='X';

        merge(grid,i-1,j);
        merge(grid,i+1,j);
        merge(grid,i,j-1);
        merge(grid,i,j+1);

    }
}
