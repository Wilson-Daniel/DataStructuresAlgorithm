package DataStructuresAlgorithm.DAY__74;

public class BACKTRACKING_Rat_In_A_Maze {
    public static void main(String[] args) {
        int[][] maze = {{1,0,0,0},
                        {1,1,0,1},
                        {0,1,0,0},
                        {1,1,1,1}};
        solveMaze(maze);
    }
    public static boolean solveMaze(int maze[][]){
        int N = maze.length;
        int sol[][] = new int[N][N];
        if(solveMazeUntil(maze, 0, 0, sol) == false){
            System.out.println("Solution doesn't exist");
            return false;
        }
        printMaze(sol);
        return true;
    }
    public static boolean solveMazeUntil(int[][] maze, int x,int y,int[][] sol){
        if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
            sol[x][y] = 1;
            return true;
        }
        //check if maze[x][y] is valid
        if(isSafe(maze,x,y) == true){
//            if(sol[x][y] == 1){
//                return false;
//            }
            sol[x][y] = 1;
            if(solveMazeUntil(maze,x+1,y,sol)){
                return true;
            }
            if(solveMazeUntil(maze,x,y+1,sol)){
                return true;
            }
//            sol[x][y] = 0;
//            return false;
        }
        return false;
    }
    public static boolean isSafe(int[][] maze,int x,int y){
        return (x>=0 && x<maze.length && y>=0 && y< maze.length && maze[x][y] == 1);
    }
    public static void printMaze(int[][] sol){
        for(int i=0 ; i< sol.length ; i++){
            for(int j=0 ; j<sol.length ; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

}
