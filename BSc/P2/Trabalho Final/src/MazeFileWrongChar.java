/**
 * Created by Tomás Rosendo on 5/20/2017.
 */
public class MazeFileWrongChar extends Exception {
    public MazeFileWrongChar(int line, int col){
        super(String.format("\n*** INVALID CHARACTERS IN LINE %d, COLUMN %d***\n", line, col));
    }
}
