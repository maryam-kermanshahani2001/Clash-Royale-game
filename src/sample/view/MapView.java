package sample.view;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import sample.model.MapComponent;
import sample.model.elements.TroopCards.Archer;
import sample.model.elements.TroopCards.Barbarian;
import sample.model.elements.TroopCards.Giant;
import sample.model.mapComponents.Ground;
import sample.model.mapComponents.KingTower;
import sample.model.mapComponents.Map;
import sample.model.mapComponents.QueenTower;

import java.nio.file.Paths;
import java.util.EventListener;

/**
 * The type Map view.
 */
public class MapView extends Group {

    /**
     * The constant CELL_WIDTH.
     */
    public final static double CELL_WIDTH = 35.0;
    /**
     * The constant CELL_HEIGHT.
     */
    public final static double CELL_HEIGHT = 35.0;

    /**
     * Gets cell width.
     *
     * @return the cell width
     */
    public static double getCellWidth() {
        return CELL_WIDTH;
    }

    private String title;

    private int rowCount = 18;
    private int columnCount = 33;
    private ImageView[][] cellViews;

    private Image kingTowerImage;
    private Image queenTowerImage;


    private Image cannonImg;
    private Image infernoTowerImg;
    private Image arrowImg;
    private Image rageImg;
    private Image fireBallImg;
    private Image archerImg;
    private Image barbarianImg;
    private Image dragonImg;
    private Image giantImg;
    private Image miniImg;
    private Image valkyrieImg;
    private Image wizardImg;

    private Image miniPekkaImage;
    private Image groundImage;
    private Image rect;
    private Image babyDragonImage;

    /**
     * Instantiates a new Map view.
     */
    public MapView() {
        this.title = title;
//        initializeGrid();

        this.initializeGrid();
        loadImages();
//        InputStream is;

//        this.kingTowerImage = new Image(getClass().getResourceAsStream("../Pics/building_1.png"));
//        this.kingTowerImage =new Image(getClass().getResourceAsStream("Pics/building_1.png"));
    }


    private void loadImages() {

        this.queenTowerImage = new Image(Paths.get("./src/sample/view/Pics/queenTower.PNG").toUri().toString());
        this.kingTowerImage = new Image(Paths.get("./src/sample/view/Pics/kingTower.PNG").toUri().toString());

        this.giantImg = new Image(Paths.get("./src/sample/view/Pics/giantt.gif").toUri().toString());
        this.archerImg = new Image(Paths.get("./src/sample/view/Pics/archerr.gif").toUri().toString());
        this.miniPekkaImage = new Image("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\Pics\\0_Jeweler_Chagrin_001.png");
        this.groundImage = new Image("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\Pics\\medievalTile_58.png");
        this.babyDragonImage = new Image("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\Pics\\babyDragon.gif");
        this.rect = new Image("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\Pics\\ezgif.com-gif-maker(4).gif");

    }


    /**
     * Constructs an empty grid of ImageViews
     */
    private void initializeGrid() {
        cellViews = new ImageView[rowCount][columnCount];
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                ImageView imageView = new ImageView();
                imageView.setX(column * CELL_WIDTH);
                //???
                imageView.setY(row * CELL_WIDTH);
                imageView.setFitWidth(CELL_WIDTH);
                imageView.setFitHeight(CELL_WIDTH);
                cellViews[row][column] = imageView;

//                cellViews[row][column].setImage(queenTowerImage);
                this.getChildren().add(imageView);
            }
            // point2D saves in set and iterate it 
        }

    }

    /**
     * Update.
     *
     * @param map the map
     */
    public void update(Map map) {

        //for each ImageView, set the image to correspond with the CellValue of that cell
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                MapComponent component = map.getMyMapComponents()[row][col];
                /*if (row == 9 && col == 16) {
                    cellViews[row][col].setImage(queenTowerImage);

                }*/
                if (component instanceof QueenTower) {
                  /*  System.out.println("hi from mapview");
                    System.out.println(cellViews[row][col].getX());*/
                    cellViews[row][col].setImage(queenTowerImage);
                } else if (component instanceof KingTower) {
                    cellViews[row][col].setImage(kingTowerImage);
                } else if (component instanceof Barbarian) {
                    cellViews[row][col].setImage(rect);
                } else if (component instanceof Giant) {
                    cellViews[row][col].setImage(giantImg);
                }
                else if (component instanceof Archer) {
                    cellViews[row][col].setImage(archerImg);
                }
               /* else if (component instanceof Ground) {
                    cellViews[row][col].setImage(groundImage);
                }*/

            }
        }
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    private void createGameFrame() {

    }

    /**
     * Gets row count.
     *
     * @return the row count
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * Sets row count.
     *
     * @param rowCount the row count
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * Gets column count.
     *
     * @return the column count
     */
    public int getColumnCount() {
        return columnCount;
    }

    /**
     * Sets column count.
     *
     * @param columnCount the column count
     */
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    /**
     * Get cell views image view [ ] [ ].
     *
     * @return the image view [ ] [ ]
     */
    public ImageView[][] getCellViews() {
        return cellViews;
    }


    /**
     * Sets cell views.
     *
     * @param cellViews the cell views
     */
    public void setCellViews(ImageView[][] cellViews) {
        this.cellViews = cellViews;
    }
}
