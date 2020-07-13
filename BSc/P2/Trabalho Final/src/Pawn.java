import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomás Rosendo on 5/18/2017.
 */
public class Pawn implements IPawn {
    int start[] = new int[2];
    int actual[] = new int[2];


    public Pawn(int[] start){
        this.start[0] = start[0]; // X value
        this.start[1] = start[1]; // Y value
        setPosition(start[0], start[1]);
    }

    public void move(Move m) {
        switch(m){
            case NORTH:
                setPosition(actual[0], actual[1] - 1);
                break;
            case SOUTH:
                setPosition(actual[0], actual[1] + 1);
                break;
            case WEST:
                setPosition(actual[0] - 1, actual[1]);
                break;
            case EAST:
                setPosition(actual[0] + 1, actual[1]);
                break;
        }
    }

    public Route getRoute() {
        return null;
    }

    public int[] getPosition(){
        return actual;
    }

    public void setPosition(int x, int y){
        actual[0] = x;
        actual[1] = y;
    }


}
