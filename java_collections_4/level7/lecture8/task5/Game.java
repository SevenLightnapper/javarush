package javarush.java_collections_4.level7.lecture8.task5;

public abstract class Game {

    public abstract void prepareForTheGame();
    public abstract void playGame();
    public abstract void congratulateWinner();

    public void run() {
        prepareForTheGame();
        playGame();
        congratulateWinner();
    }
}
