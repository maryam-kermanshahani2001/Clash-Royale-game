package sample.model.mapComponents;

import javafx.scene.Group;
import sample.model.MapComponent;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.Properties;
import java.util.Scanner;


/**
 * The type Map 2.
 */
public class Map2 {
    private MapComponent[][] myMapComponents;
    private Character[][] mapWithString;
    private int rowCount;
    private int columnCount;

    /**
     * Instantiates a new Map 2.
     */
    public Map2() {
        rowCount = 18;
        columnCount = 33;
        this.myMapComponents = new MapComponent[rowCount][columnCount];
        this.mapWithString = new Character[rowCount][columnCount];
//        initializeMap("D:\\Classes\\Ap_main_class\\FinalProject\\src\\sample\\view\\Map.txt");
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

/*
    public void mapStringInit() {
        Character[][] mapWithString = {{'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'Q', 'Q', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'Q', 'Q', 'G', 'G'},
                {'G', 'G', 'Q', 'Q', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'Q', 'Q', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'G', 'G', 'Q', 'Q', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'Q', 'Q', 'G', 'G'},
                {'G', 'G', 'Q', 'Q', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'Q', 'Q', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'}
        };
        this.mapWithString = mapWithString;
    }

    public void initializeMap() {
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
                        col++;
                        break;
                    case 'G':
                    case 'Y':
                        // ground
                        if (col <= 15) {
                            Ground ground1 = new Ground();
                            myMapComponents[row][col] = ground1;
                            col++;
                            ground1.setTeamNum(1);
                        } else {
                            Ground ground2 = new Ground();
                            myMapComponents[row][col] = ground2;
                            col++;
                            ground2.setTeamNum(2);
                        }

                        break;
                    case 'K':

*/
/* Properties properties = new Properties();
                        properties.getProperty();
                         make file and put inputstream in arg*//*


                        if (col <= 15) {
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
                                col += 3;
                                kingTower.setTeamNum(1);
                                kingRowCounter++;
                            } else if (kingRowCounter == 2) {
                                kingRowCounter++;
                                col += 3;
                            } else {
                                kingRowCounter = 1;
                                col += 3;
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
                                kingTower.setTeamNum(2);
                                col += 3;
                                kingRowCounter++;
                            } else if (kingRowCounter == 2) {
                                kingRowCounter++;
                                col += 3;
                            } else {
                                kingRowCounter = 1;
                                col += 3;
                                continue;
                            }
                        }
//                        col++;
                        break;
                    case 'Q':
                        if (col <= 15) {
                            if (queenRowCounterPl == 1) {
                                QueenTower queenTower = new QueenTower();
                                myMapComponents[row][col] = queenTower;
                                myMapComponents[row][col + 1] = queenTower;
                                myMapComponents[row + 1][col] = queenTower;
                                myMapComponents[row + 1][col + 1] = queenTower;
                                queenTower.setTeamNum(1);
                                col += 2;
                                queenRowCounterPl++;
                            } else {
                                col += 2;
                                queenRowCounterPl = 1;
                                continue;
                            }
                        } else {
                            if (queenRowCounterOp == 1) {
                                QueenTower queenTower = new QueenTower();
                                myMapComponents[row][col] = queenTower;
                                myMapComponents[row][col + 1] = queenTower;
                                myMapComponents[row + 1][col] = queenTower;
                                myMapComponents[row + 1][col + 1] = queenTower;
                                queenTower.setTeamNum(2);
                                queenRowCounterOp++;
                                col += 2;

                            } else {
                                col += 2;
                                queenRowCounterOp = 1;
                                continue;
                            }
                        }
                        break;
                }
//                col++;
            }
            row++;
        }
    }
*/

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
                    case 'Y':
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

//    public void initializeMap(String fileName) {
//        rowCount = 18;
//        columnCount = 33;
//        File file = new File(fileName);
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        int row = 0;
//        int kingRowCounter = 1;
//        int queenRowCounter = 1;
//
//        Ground ground = new Ground();
//        while (sc.hasNextLine()) {
//            int col = 0;
//            String line = sc.nextLine();
//            Scanner lineScanner = new Scanner(line);
//            while (lineScanner.hasNext()) {
//                String value = lineScanner.next();
//                switch (value) {
//                    case "R":
//                        Ground ground = new Ground();
//                        myMapComponents[row][col] = ground;
//                        ground.setTeamNum(0);
//                        col++;
//                        break;
//                    case "G":
//                    case "Y":
//                         ground
//                        if (col <= 15) {
//                            Ground ground1 = new Ground();
//                            myMapComponents[row][col] = ground1;
//                            col++;
//                            ground1.setTeamNum(1);
//                        } else {
//                            Ground ground2 = new Ground();
//                            myMapComponents[row][col] = ground2;
//                            col++;
//                            ground2.setTeamNum(2);
//                        }
//
//                        break;
//                    case "K":
//                       /* Properties properties = new Properties();
//                        properties.getProperty();
//                         make file and put inputstream in arg*/
//                        if (col <= 15) {
//                            if (kingRowCounter == 1) {
//                                KingTower kingTower = new KingTower();
//                                myMapComponents[row][col] = kingTower;
//                                myMapComponents[row][col + 1] = kingTower;
//                                myMapComponents[row][col + 2] = kingTower;
//                                myMapComponents[row + 1][col] = kingTower;
//                                myMapComponents[row + 1][col + 1] = kingTower;
//                                myMapComponents[row + 1][col + 2] = kingTower;
//                                myMapComponents[row + 2][col] = kingTower;
//                                myMapComponents[row + 2][col + 1] = kingTower;
//                                myMapComponents[row + 2][col + 2] = kingTower;
//                                col += 2;
//                                kingTower.setTeamNum(1);
//                                kingRowCounter++;
//                            } else if (kingRowCounter == 2) {
//                                kingRowCounter++;
//                                col += 2;
//                            } else {
//                                kingRowCounter = 1;
//                                col += 2;
//                                continue;
//                            }
//                        } else {
//                            if (kingRowCounter == 1) {
//                                KingTower kingTower = new KingTower();
//                                myMapComponents[row][col] = kingTower;
//                                myMapComponents[row][col + 1] = kingTower;
//                                myMapComponents[row][col + 2] = kingTower;
//                                myMapComponents[row + 1][col] = kingTower;
//                                myMapComponents[row + 1][col + 1] = kingTower;
//                                myMapComponents[row + 1][col + 2] = kingTower;
//                                myMapComponents[row + 2][col] = kingTower;
//                                myMapComponents[row + 2][col + 1] = kingTower;
//                                myMapComponents[row + 2][col + 2] = kingTower;
//                                kingTower.setTeamNum(2);
//                                col += 2;
//                                kingRowCounter++;
//                            } else if (kingRowCounter == 2) {
//                                kingRowCounter++;
//                                col += 2;
//                            } else {
//                                kingRowCounter = 1;
//                                col += 2;
//                                continue;
//                            }
//                        }
//                        col++;
//                        break;
//                    case "Q":
//                        if (col <= 15) {
//                            if (queenRowCounter == 1) {
//                                QueenTower queenTower = new QueenTower();
//                                myMapComponents[row][col] = queenTower;
//                                myMapComponents[row][col + 1] = queenTower;
//                                myMapComponents[row + 1][col] = queenTower;
//                                myMapComponents[row + 1][col + 1] = queenTower;
//                                queenTower.setTeamNum(1);
//                                col += 1;
//                                queenRowCounter++;
//                            } else {
//                                col += 1;
//                                queenRowCounter = 1;
//                                continue;
//                            }
//                        } else {
//                            if (queenRowCounter == 1) {
//                                QueenTower queenTower = new QueenTower();
//                                myMapComponents[row][col] = queenTower;
//                                myMapComponents[row][col + 1] = queenTower;
//                                myMapComponents[row + 1][col] = queenTower;
//                                myMapComponents[row + 1][col + 1] = queenTower;
//                                queenTower.setTeamNum(2);
//                                queenRowCounter++;
//                                col += 1;
//
//                            } else {
//                                col += 1;
//                                queenRowCounter = 1;
//                                continue;
//                            }
//                        }
//                        col++;
//                        break;
//                }
//            }
//            row++;
//        }
//    }

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
