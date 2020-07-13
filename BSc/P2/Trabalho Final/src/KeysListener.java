import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Tomás Rosendo on 5/27/2017.
 */
public class KeysListener implements KeyListener {
    private Move keyPressed;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_DOWN:
                setKeyPressed(Move.SOUTH);
                System.out.println(getKeyPressed());
                break;
            case KeyEvent.VK_UP:
                setKeyPressed(Move.NORTH);
                System.out.println("Up arrow key pressed");
                break;
            case KeyEvent.VK_LEFT:
                setKeyPressed(Move.WEST);
                System.out.println("Left arrow key pressed");
                break;
            case KeyEvent.VK_RIGHT:
                setKeyPressed(Move.EAST);
                System.out.println("Right arrow key pressed");
                break;
        }
    }

    public void setKeyPressed(Move m){
        keyPressed = m;
    }
    public Move getKeyPressed(){
        return keyPressed;
    }

    public void resetKeyPressed(){
        keyPressed = null;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
