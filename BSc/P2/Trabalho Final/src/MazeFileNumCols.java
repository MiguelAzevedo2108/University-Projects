/**
 * Created by Tomás Rosendo on 5/20/2017.
 */
public class MazeFileNumCols extends Exception {
    public MazeFileNumCols(int line){ super(String.format("\n*** INVALID NUMBER OF CHARACTERS IN LINE %d ***\n", line)); }
}
