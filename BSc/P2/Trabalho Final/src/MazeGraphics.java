/**
 * Created by Tomás Rosendo on 5/18/2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class MazeGraphics {

    private JFrame window;
    private Container drawBoard;
    private Graphics g;

    private int width;
    private int height;



    int[] start;

    private final int pawnSideSize = 20;

    private final int border = 20;

    public static MazeCell[][] mazeCells;

    public final static int gridSideSize = 40;

    public static KeysListener keys = new KeysListener();


    public MazeGraphics(int w, int h, String title){
        window = new JFrame(title);
        window.setSize(w, h);
        window.setLocation(0, 0);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.addKeyListener(keys);

        drawBoard = window.getContentPane();
        drawBoard.setBackground(Color.WHITE);

        g = drawBoard.getGraphics();

    }

    public void drawMazeGrid(int totalHeight, int totalWidth, String[] maze) throws Exception{

        width = totalHeight / gridSideSize; // x
        height = totalWidth / gridSideSize; // y

        g.drawRect(0, 0, totalWidth, totalHeight);
        //String[][] mazeGrid = new String[(int) totalHeight / gridSideSize][(int) totalWidth / gridSideSize];

        try {Thread.sleep(200);} catch (Exception e) {} //Waiting compass in order to graphics to apear

        mazeCells = new MazeCell[width][height];
        int x, y;
        for(int i = 0; i < totalHeight; i += gridSideSize){
            for(int j = 0; j < totalWidth; j += gridSideSize){
                x = j / gridSideSize;
                y = i / gridSideSize;
                g.setColor(Color.BLACK);
               //System.out.println("Height - " + y + "\tWidth - " + x);
                switch(maze[y].charAt(x)) {
                    case 'W':
                        mazeCells[y][x] = MazeCell.WALL;
                        //g.fillRoundRect(j+0, i+0, gridSideSize+0, gridSideSize+0, 20, 20);
                        g.fillRect(j+border, i+border, gridSideSize+0, gridSideSize+0);
                        break;
                    case 'S':
                        mazeCells[y][x] = MazeCell.START;
                        setPawnStart(x,  y);
                        g.setColor(Color.GREEN);
                        g.fillRect(j+border, i+border, gridSideSize+0, gridSideSize+0);
                        break;
                    case 'E':
                        mazeCells[y][x] = MazeCell.EXIT;
                        g.setColor(Color.RED);
                        g.fillRect(j+border, i+border, gridSideSize+0, gridSideSize+0);
                        break;
                    case '_':
                        mazeCells[y][x] = MazeCell.EMPTY;
                        g.drawRect(j+border, i+border, gridSideSize+0, gridSideSize+0);
                        break;
                    default:
                        throw new MazeFileWrongChar(y + 1, x + 1);
                }
            }
        }
/*
        width = totalHeight / gridSideSize;
        height = totalWidth / gridSideSize;

        this.mazeGrid = mazeGrid;
        return mazeGrid;
*/

    }

    public MazeCell[][] getMazeCells(){
        return mazeCells;
    }


    private void setPawnStart(int x, int y){
        start = new int[2];
        start[0] = x;
        start[1] = y;
    }

    public int[] getPawnStart(){
        return start;
    }

    public void drawPawn(IPawn p){

        g.setColor(Color.BLUE);
        int x = p.getPosition()[0] * gridSideSize;
        int y = p.getPosition()[1] * gridSideSize;
        int centerXY = (gridSideSize / 2) - (pawnSideSize / 2);
        g.fillOval(x + centerXY + border, y + centerXY + border, pawnSideSize, pawnSideSize);

    }
    public void erasePawn(int[] previous){
        int x = previous[0] * gridSideSize;
        int y = previous[1] * gridSideSize;
        int centerXY = (gridSideSize / 2) - (pawnSideSize / 2);
        switch(mazeCells[y/gridSideSize][x/gridSideSize]){
            case START:
                g.setColor(Color.GREEN);
                break;
            case EMPTY:
                g.setColor(Color.WHITE);
                break;
        }

        g.fillOval(x + centerXY + border, y + centerXY + border, pawnSideSize, pawnSideSize);
    }
/*
    public void drawEmpty(int x, int y){
        g.setColor(Color.WHITE);
        g.fillRect(x+border, y+border, gridSideSize+0, gridSideSize+0);
    }
*/
    public static KeysListener getKeyListenerObj(){
        return keys;
    }

    public MazeCell getPawnActualCell(IPawn p){
        int[] actual = p.getPosition();
        return mazeCells[actual[1]][actual[0]];
    }

}
