package javarush.java_multithreading_3.level10.lecture15_2048;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * будет следить за нажатием клавиш во время игры.
 */

public class Controller extends KeyAdapter {
    private Model model; // model
    private View view; // view
    private static int WINNING_TILE = 2048; // вес плитки при достижении которого игра будет считаться выигранной

    public Controller(Model model) {
        this.model = model;
        this.view = new View(this);
    }

    public Tile[][] getGameTiles() {
        return model.getGameTiles();
    }

    public int getScore() {
        return model.score;
    }

    public View getView() {
        return view;
    }

    public void resetGame() {
        model.score = 0;
        view.isGameWon = false;
        view.isGameLost = false;
        model.resetGameTiles();
    }

    @Override
    public void keyPressed(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_ESCAPE) resetGame();
        if (!model.canMove()){
            view.isGameLost = true;
            //JOptionPane.showMessageDialog(view, "You've lost :(");
            //resetGame();
        }
        if (!view.isGameLost && !view.isGameWon) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    model.left();
                    break;
                case KeyEvent.VK_UP:
                    model.up();
                    break;
                case KeyEvent.VK_RIGHT:
                    model.right();
                    break;
                case KeyEvent.VK_DOWN:
                    model.down();
                    break;
                case KeyEvent.VK_Z:
                    model.rollback();
                    break;
                case KeyEvent.VK_R:
                    model.randomMove();
                    break;
                case KeyEvent.VK_A:
                    model.autoMove();
                    break;
            }
        }
        if (model.maxTile == WINNING_TILE){
            view.isGameWon = true;
            //JOptionPane.showMessageDialog(view, "You've won!");
            //resetGame();

        }
        view.repaint();
    }
}