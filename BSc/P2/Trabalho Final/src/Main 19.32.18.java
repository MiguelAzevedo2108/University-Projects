/**
 * Created by Tomás Rosendo on 5/17/2017.
 */
//import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.io.*;

public class Main{
    //private static int width, height;

    private static String[] maze;
    private static MazeCell[][] mazeCells;
    private static MazeGraphics maze_GUI;
    private static IPawn pawn;
    private static IMaze mazeMaze;

    public static void main(String[] args){

        readFile();

        int h = maze.length * MazeGraphics.gridSideSize;            //altura (y)
        int w = maze[0].length() * MazeGraphics.gridSideSize;       //largura (x)

        maze_GUI = new MazeGraphics(w + 100, h + 100, "MazeRunner");

        try {
            maze_GUI.drawMazeGrid(h, w, maze);
        }catch (Exception e){
            System.out.println(e.getMessage());
            for(int i=0; i<2; i++) System.out.println(e.getStackTrace()[i]);
            System.exit(0);
        }

        pawn = new Pawn(maze_GUI.getPawnStart());
        maze_GUI.drawPawn(pawn);

        mazeCells = maze_GUI.getMazeCells();

        mazeMaze = new Maze(mazeCells);
        Move[] options = mazeMaze.getOptions(pawn);

        System.out.println("Available moves:");
        for(Move m : options) if(m != Move.NOOP){ System.out.println("> " + m);}

        play();

        System.out.println("Exit Reached");

/*
        if(maze.canMove(pawn, Move.SOUTH)){
            pawn.move(Move.SOUTH);
            maze_GUI.drawPawn(pawn);
        }
*/


    }



    private static void readFile(){ //"returns" string array with each line of the file

        Scanner fileName = new Scanner (System.in);

        BufferedReader read = null;

        System.out.print("File Name -> ");
        String fileNameStr = fileName.next();

        try{
            read = new BufferedReader(new FileReader(fileNameStr));

        }catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0); // close the system here.

        }

        String line;
        int numberOfRows = 0;


        try{
            while(read.readLine() != null){
                numberOfRows++;
            }

            read.close();
            read = new BufferedReader(new FileReader(fileNameStr));
            maze = new String[numberOfRows];

            line = read.readLine();
            int charNumber = line.length();

            for(int i = 0; i < maze.length; i++){
                maze[i] = line.substring(0, line.length()-2);
                if(charNumber != line.length()){
                    throw new MazeFileNumCols(i + 1);
                }
                line = read.readLine();
            }
            read.close();

        }catch (IOException e){
            System.out.println(e.getMessage() + " - Error reading file");
            for(int i=0; i<2; i++) System.out.println(e.getStackTrace()[i]);
            System.exit(0); // close the system here.
        }catch (MazeFileNumCols m){
            System.out.println(m.getMessage());
            for(int i=0; i<2; i++) System.out.println(m.getStackTrace()[i]);
            System.exit(0); // close the system here.
        }
    }

    private static void play(){
        KeysListener keyboard = MazeGraphics.getKeyListenerObj();
        Move m;
        int[] previous;
        while(MazeCell.EXIT != maze_GUI.getPawnActualCell(pawn)) {
            m = keyboard.getKeyPressed();
            if(mazeMaze.canMove(pawn, m)){
                previous = pawn.getPosition();
                maze_GUI.erasePawn(previous);
                pawn.move(m);
                maze_GUI.drawPawn(pawn);
                keyboard.resetKeyPressed();
            }
        }
    }

}
