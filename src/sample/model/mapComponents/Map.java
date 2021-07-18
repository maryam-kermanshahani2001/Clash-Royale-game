package sample.model.mapComponents;

import javafx.scene.Group;
import sample.model.MapComponent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;


public class Map {
    private MapComponent[][] myMapComponents;
    private Character[][] mapWithString;
    private int rowCount;
    private int columnCount;

    public Map() {
        rowCount = 18;
        columnCount = 32;
        this.myMapComponents = new MapComponent[rowCount][columnCount];
        this.mapWithString = new Character[rowCount][columnCount];

    }


    public void initializeMap(String fileName) {
        rowCount = 18;
        columnCount = 33;
        File file = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int row = 0;
        int kingRowCounter = 1;
        int queenRowCounter = 1;

        Ground ground = new Ground();
        while (sc.hasNextLine()) {
            int col = 0;
            String line = sc.nextLine();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String value = lineScanner.next();
                switch (value) {
                    case "G":
                    case "Y":
                        // ground
                        myMapComponents[row][col] = ground;
                        col++;
                        break;
                    case "K":
                       /* Properties properties = new Properties();
                        properties.getProperty();
                         make file and put inputstream in arg*/
                        if (col <= 16) {
                            if (kingRowCounter == 1) {
                                KingTower kingTower = new KingTower();
                                myMapComponents[row][col] = kingTower;
                                myMapComponents[row][col + 1] = kingTower;
                                myMapComponents[row][col + 2] = kingTower;
                                myMapComponents[row + 1][col] = kingTower;
                                myMapComponents[row + 1][col + 1] = kingTower;
                                myMapComponents[row + 1][col + 2] = kingTower;
                                myMapComponents[row + 2][col] = kingTower;
                                myMapComponents[row + 2][col + 1] = kingTower;
                                myMapComponents[row + 2][col + 2] = kingTower;
                                col += 2;
                                kingTower.setForOpp(false);
                                kingRowCounter++;
                            } else if (kingRowCounter == 2) {
                                kingRowCounter++;
                                col += 2;
                            } else {
                                kingRowCounter = 1;
                                col += 2;
                                continue;
                            }
                        } else {
                            if (kingRowCounter == 1) {
                                KingTower kingTower = new KingTower();
                                myMapComponents[row][col] = kingTower;
                                myMapComponents[row][col + 1] = kingTower;
                                myMapComponents[row][col + 2] = kingTower;
                                myMapComponents[row + 1][col] = kingTower;
                                myMapComponents[row + 1][col + 1] = kingTower;
                                myMapComponents[row + 1][col + 2] = kingTower;
                                myMapComponents[row + 2][col] = kingTower;
                                myMapComponents[row + 2][col + 1] = kingTower;
                                myMapComponents[row + 2][col + 2] = kingTower;
                                kingTower.setForOpp(true);
                                col += 2;
                                kingRowCounter++;
                            } else if (kingRowCounter == 2) {
                                kingRowCounter++;
                                col += 2;
                            } else {
                                kingRowCounter = 1;
                                col += 2;
                                continue;
                            }
                        }
                        col++;
                        break;
                    case "Q":
                        if (col <= 16) {
                            if (queenRowCounter == 1) {
                                QueenTower queenTower = new QueenTower();
                                myMapComponents[row][col] = queenTower;
                                myMapComponents[row][col + 1] = queenTower;
                                myMapComponents[row + 1][col] = queenTower;
                                myMapComponents[row + 1][col + 1] = queenTower;
                                queenTower.setForOpp(false);
                                col += 1;
                                queenRowCounter++;
                            } else {
                                col += 1;
                                queenRowCounter = 1;
                                continue;
                            }
                        } else {
                            if (queenRowCounter == 1) {
                                QueenTower queenTower = new QueenTower();
                                myMapComponents[row][col] = queenTower;
                                myMapComponents[row][col + 1] = queenTower;
                                myMapComponents[row + 1][col] = queenTower;
                                myMapComponents[row + 1][col + 1] = queenTower;
                                queenTower.setForOpp(true);
                                queenRowCounter++;
                                col += 1;

                            } else {
                                col += 1;
                                queenRowCounter = 1;
                                continue;
                            }
                        }
                        col++;
                        break;
                }
            }
            row++;
        }
    }
}

   /* public void initializeMap(String fileName) {
        rowCount = 21;
        columnCount = 19;

        File file = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int row = 0;
        int pacmanRow = 0;
        int pacmanColumn = 0;
        int ghost1Row = 0;
        int ghost1Column = 0;
        int ghost2Row = 0;
        int ghost2Column = 0;

        while (sc.hasNextLine()) {
            int column = 0;
            String line = sc.nextLine();
            Scanner lineScanner = new Scanner(line);
            MapComponent component;
            component = new Ground();
            // TODO row o col
            //
            while (lineScanner.hasNext()) {
                String value = lineScanner.next();
                switch (value) {
                    case "G":
                    case "Y":
                        // ground
                        break;
                    case "K":
                        Properties properties = new Properties();
                        properties.getProperty();
                        // make file and put inputstream in arg
                        component = new KingTower();
                        break;
                    case "Q":
                        component = new QueenTower();
                        ghost1Row = row;
                        ghost1Column = column;
                        break;*/
//                    case "2":
//                        thisValue = CellValue.GHOST2HOME;
//                        ghost2Row = row;
//                        ghost2Column = column;
//                        break;
//                    case "P":
//                        thisValue = CellValue.PACMANHOME;
//                        pacmanRow = row;
//                        pacmanColumn = column;
//                        break;
//                    default:
//                        thisValue = CellValue.EMPTY;
//                        break;
//                }
//                grid[row][column] = thisValue;
//                column++;
//            }
//            row++;
//        }
//        pacmanLocation = new Point2D(pacmanRow, pacmanColumn);
//        pacmanVelocity = new Point2D(0, 0);
//        ghost1Location = new Point2D(ghost1Row, ghost1Column);
//        ghost1Velocity = new Point2D(-1, 0);
//        ghost2Location = new Point2D(ghost2Row, ghost2Column);
//        ghost2Velocity = new Point2D(-1, 0);
//        currentDirection = Direction.NONE;
//        lastDirection = Direction.NONE;


//    }
//}
