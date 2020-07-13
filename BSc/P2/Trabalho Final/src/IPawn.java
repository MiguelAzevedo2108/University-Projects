/**
 * Created by Tomás Rosendo on 5/18/2017.
 */
public interface IPawn {
    void move(Move m); // changes this pawn position according to move.
    Route getRoute(); // returns the current route.
    int[] getPosition(); // returns current position
    void setPosition(int x, int y); // set current positon
}