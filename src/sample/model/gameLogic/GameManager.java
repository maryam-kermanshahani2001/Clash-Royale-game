package sample.model.gameLogic;


import sample.model.elements.Card;
import sample.model.elements.ComponentCards;
import sample.model.playersPack.BotPlayer;

/**
 * The type Game manager.
 */
public class GameManager {

    private GameState gameState;

    /**
     * Instantiates a new Game manager.
     */
    public GameManager() {
        gameState = GameState.getInstance();
        gameInit();
    }

    /**
     * Game init.
     */
    public void gameInit() {
        gameState.constructMap();
        botInit();

    }

    private void botInit() {
        BotPlayer bot = new BotPlayer();
        gameState.setBot(bot);
        bot.produceRandomCard();
        bot.placeACardOnMap();
    }

    /**
     * Update.
     */
    public void update() {

    }

    /**
     * Add map component.
     */
    public void addMapComponent() {


    }


    /**
     * Produce random card.
     */
    public void produceRandomCard() {
//        gameState.getCurrPlayer().getCards()
    }

    /**
     * Gets game state.
     *
     * @return the game state
     */
    public GameState getGameState() {
        return gameState;
    }

    /**
     * Sets game state.
     *
     * @param gameState the game state
     */
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    /**
     * Add character on cell.
     *
     * @param xIndex the x index
     * @param yIndex the y index
     * @param card   the card
     */
    public void addCharacterOnCell(int xIndex, int yIndex, Card card) {
        gameState.getCurrPlayer().setElixir(gameState.getCurrPlayer().getElixir() - card.getCost());
        gameState.getMap().addMapComponent(xIndex, yIndex, card);
    }


    /**
     * Look for enemy.
     *
     * @param srcComp the src comp
     */
    /*public void lookForEnemy(ComponentCards srcComp) {
        int towerX = (int) srcComp.getLocation().getX();
        int towerY = (int) srcComp.getLocation().getY();

//        int maxXRange = (int)(towerX + gameState.CELL_WIDTH * srcComp.getRange());
//        int maxYRange = (int)(towerY + gameState.CELL_WIDTH * srcComp.getRange());

        int col = (int) ( towerX / gameState.CELL_WIDTH);
        int row = (int) ( towerY / gameState.CELL_WIDTH);

        for (int i = 1; i < srcComp.getRange(); i++) {
            if ()
        }

    }*/
}
