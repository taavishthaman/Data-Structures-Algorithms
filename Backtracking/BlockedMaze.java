public class BlockedMaze{


    public static void main(String[] args){
        int[][] maze = {{0,1,0,1},{0,0,1,1},{1,0,0,0},{0,1,0,0}};

        blockedMaze(maze, new boolean[4][4], 0, 0, "");
    }

    static void blockedMaze(int[][] maze, boolean[][] visited, int row, int col, String ans){

        if(row == maze.length-1 && col == maze[0].length-1){
            printBoard(visited);
            System.out.println(ans);
            return;
        }

        if(row == -1 || row == maze.length || col == -1 || col == maze[0].length || visited[row][col] || maze[row][col] == 1){
            return;
        }

        visited[row][col] = true;

        //Top
        blockedMaze(maze, visited, row-1, col, ans+"T");
        //Left
        blockedMaze(maze, visited, row, col-1, ans+"L");
        //Right
        blockedMaze(maze, visited, row, col+1, ans+"R");
        //Bottom
        blockedMaze(maze, visited, row+1, col, ans+"B");

        visited[row][col] = false;
    }

    static void printBoard(boolean[][] visited){
        for(int i=0; i<visited.length; i++){
            for(int j=0; j<visited[0].length; j++){
                if(visited[i][j]){
                    System.out.print("P");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}