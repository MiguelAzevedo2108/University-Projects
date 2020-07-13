/**
 * Created by Tomás Rosendo on 5/18/2017.
 */
public interface IMaze {
    boolean canMove(IPawn p, Move m); // true IFF pawn can do move in this maze.
    Move[] getOptions(IPawn p); // returns the possible moves of pawn.
    void move(IPawn p, Move m); // if pawn can move, change his position.
    boolean isSolvedBy(IPawn p); // true IFF pawn is in EXIT position.
}