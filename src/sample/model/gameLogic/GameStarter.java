package sample.model.gameLogic;

public class GameStarter {

    GameState gameState;
    public GameStarter() {
        gameState = GameState.getInstance();
        gameInit();
    }

    public void gameInit() {
        gameState.constructUsers();
    }
}
