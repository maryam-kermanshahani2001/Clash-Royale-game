package sample.model.mapComponents;

import javafx.scene.Group;
import sample.model.MapComponent;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;


/**
 * The type Map.
 */
public class Map {
    private MapComponent[][] myMapComponents;
    private Character[][] mapWithString;
    private int rowCount;
    private int columnCount;

    /**
     * Instantiates a new Map.
     */
    public Map() {
        rowCount = 18;
        columnCount = 33;
        this.myMapComponents = new MapComponent[rowCount][columnCount];
        this.mapWithString = new Character[rowCount][columnCount];
        mapStringInit2();
        initializeMap2();
    }

    /**
     * Map string init 2.
     */
    public void mapStringInit2() {
        Character[][] mapWithString = {{'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'Q', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'Q', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'K', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'K', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'Q', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'Q', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'}
        };
        this.mapWithString = mapWithString;
    }

    /**
     * Initialize map 2.
     */
    public void initializeMap2() {
        int row = 0;
        int kingRowCounter = 1;
        int queenRowCounterPl = 1;
        int queenRowCounterOp = 1;
        while (row < 18) {
            int col = 0;
            while (col < 33) {
                switch (mapWithString[row][col]) {
                    case 'R':
                        Ground ground = new Ground();
                        myMapComponents[row][col] = ground;
                        ground.setTeamNum(0);
                        break;
                    case 'G':
                        // ground
                        if (col <= 15) {
                            Ground ground1 = new Ground();
                            myMapComponents[row][col] = ground1;
                            ground1.setTeamNum(1);
                        } else {
                            Ground ground2 = new Ground();
                            myMapComponents[row][col] = ground2;
                            ground2.setTeamNum(2);
                        }

                        break;
                    case 'K':

/* Properties properties = new Properties();
                        properties.getProperty();
                         make file and put inputstream in arg*/

                        if (col <= 15) {
                            KingTower kingTower = new KingTower();
                            myMapComponents[row][col] = kingTower;
                            kingTower.setTeamNum(1);
                            kingRowCounter++;

                        } else {
                            KingTower kingTower = new KingTower();
                            myMapComponents[row][col] = kingTower;
                            kingTower.setTeamNum(2);
                        }
                        break;
                    case 'Q':
                        if (col <= 15) {
                            QueenTower queenTower = new QueenTower();
                            myMapComponents[row][col] = queenTower;

                            queenTower.setTeamNum(1);
                        } else {
                            QueenTower queenTower = new QueenTower();
                            myMapComponents[row][col] = queenTower;

                            queenTower.setTeamNum(2);
                        }
                        break;
                }
                col++;
            }
            row++;
        }
    }

    /**
     * Get my map components map component [ ] [ ].
     *
     * @return the map component [ ] [ ]
     */
    public MapComponent[][] getMyMapComponents() {
        return myMapComponents;
    }

    /**
     * Sets my map components.
     *
     * @param myMapComponents the my map components
     */
    public void setMyMapComponents(MapComponent[][] myMapComponents) {
        this.myMapComponents = myMapComponents;
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
     * Add map component.
     *
     * @param xIndex    the x index
     * @param yIndex    the y index
     * @param component the component
     */
    public void addMapComponent(int xIndex, int yIndex, MapComponent component) {
        myMapComponents[yIndex][xIndex] = component;
        if (xIndex <= 15) {
            component.setTeamNum(1);
        }
        else {
            component.setTeamNum(2);
        }
    }

}
