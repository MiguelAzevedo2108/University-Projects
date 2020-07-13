/**
 * Created by Tomás Rosendo on 5/17/2017.
 */



public class Maze implements IMaze{

    private MazeCell[][] maze;

    public Maze(MazeCell[][] m){
        maze = m;
    }

    //Interface Methods
    public boolean canMove(IPawn p, Move m){
        int[] pos = p.getPosition();
        Move[] opt = getOptions(p);
        for(Move op : opt){
            if(op == m){
                return true;
            }
        }
        return false;
    }

    public Move[] getOptions(IPawn p){
        int[] actual = p.getPosition();
        Move[] options = new Move[4];
        int x = actual[0];
        int y = actual[1];
        boolean doDefault;
        MazeCell cell;
        for(int i = 0; i < 4; i++){ // 4 positions to scan
            doDefault = false;
            cell = MazeCell.WALL;
            switch (Move.values()[i]){
                case NORTH:
                    try{
                        cell = maze[y-1][x];
                    }catch (ArrayIndexOutOfBoundsException e){
                        doDefault = true;
                        break;
                    }
                    if(cell == MazeCell.EMPTY || cell == MazeCell.START || cell == MazeCell.EXIT){
                        options[i] = Move.NORTH;
                        break;
                    }else{
                        doDefault = true;
                        break;
                    }
                case SOUTH:
                    try{
                        cell = maze[y+1][x];
                    }catch (ArrayIndexOutOfBoundsException e){
                        doDefault = true;
                        break;
                    }
                    if(cell == MazeCell.EMPTY || cell == MazeCell.START || cell == MazeCell.EXIT){
                        options[i] = Move.SOUTH;
                        break;
                    }else{
                        doDefault = true;
                        break;
                    }

                case WEST:
                    try{
                        cell = maze[y][x-1];
                    }catch (ArrayIndexOutOfBoundsException e){
                        doDefault = true;
                        break;
                    }
                    if(cell == MazeCell.EMPTY || cell == MazeCell.START || cell == MazeCell.EXIT){
                        options[i] = Move.WEST;
                        break;
                    }else{
                        doDefault = true;
                        break;
                    }

                case EAST:
                    try{
                        cell = maze[y][x+1];
                    }catch (ArrayIndexOutOfBoundsException e){
                        doDefault = true;
                        break;
                    }
                    if(cell == MazeCell.EMPTY || cell == MazeCell.START || cell == MazeCell.EXIT) {
                        options[i] = Move.EAST;
                        break;
                    }else{
                        doDefault = true;
                        break;
                    }
            }
            if(doDefault == true){
                options[i] = Move.NOOP;
            }
        }
        return options;
    }

    public void move(IPawn p, Move m){

    }

    public boolean isSolvedBy(IPawn p){
        return false;
    }







/*
    public void setStart(int x , int y) throws  Exception{
        if(areCoordinatesValid(x, y)){
            startX = x;
            startY = y;
            mazeGrid[x][y] = "START";
        }
    }






    private boolean areCoordinatesValid(int x, int y) throws Exception{
        if(x > width-1 || x < 0 && y > height-1 || y < 0){
            throw new Exception("Invalid X and Y values!");
        }else if(x > width-1 || x < 0){
            throw new Exception("Invalid X value!");
        }else if(y > height-1 || y < 0){
            throw new Exception("Invalid Y value!");
        }
        return true;
    }
*/




}

