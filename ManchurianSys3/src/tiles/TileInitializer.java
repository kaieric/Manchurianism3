package tiles;
import java.awt.*;
import java.util.*;

import display.Display;
import entities.*;
import controller.*;
import utilities.*;

public class TileInitializer {

    public TileInitializer() {
    }

    public static void initializeTiles(Tile[][] tileGrid, HashMap<Province, ArrayList<Tile>> provinces) {
        initializeRehe(tileGrid, provinces);
        initializeXinganSouth(tileGrid, provinces);
    }

    public static Tile addToProvince(Province province, HashMap<Province, ArrayList<Tile>> provinces) {
        Tile tile = new Tile();
        if (provinces.get(province) == null) {
            provinces.put(province, new ArrayList<Tile>());
        }
        provinces.get(province).add(tile);
        return tile;
    }


    private static void initializePos(Tile[][] tileGrid) {
        for (int row = 0; row < tileGrid.length; row++) {
            for (int col = 0; col < tileGrid[row].length; col++) {
                if (tileGrid[row][col] != null) {
                    tileGrid[row][col].updatePos(new Position(col*30 + 50,row*30 + 50));
                }
            }
        }
    }

    private static void initializeRehe(Tile[][] tileGrid, HashMap<Province, ArrayList<Tile>> provinces) {
        tileGrid[19][4] = addToProvince(Province.REHE, provinces);
        tileGrid[19][5] = addToProvince(Province.REHE, provinces);
        tileGrid[19][6] = addToProvince(Province.REHE, provinces);
        for (int i = 0; i < 5; i ++) { tileGrid[20][2+i] = addToProvince(Province.REHE, provinces);; }
        for (int i = 0; i < 6; i ++) { tileGrid[21][1+i] = addToProvince(Province.REHE, provinces);; }
        for (int i = 0; i < 6; i ++) { tileGrid[22][1+i] = addToProvince(Province.REHE, provinces);; }
        for (int i = 0; i < 4; i ++) { tileGrid[23][2+i] = addToProvince(Province.REHE, provinces);; }
    }

    public static void initializeXinganSouth(Tile[][] tileGrid, HashMap<Province, ArrayList<Tile>> provinces) {
        tileGrid[19][2] = addToProvince(Province.REHE, provinces);;
        tileGrid[19][3] = addToProvince(Province.REHE, provinces);;
        tileGrid[19][7] = addToProvince(Province.REHE, provinces);;
        for (int i = 0; i < 6; i ++) { tileGrid[18][2+i] = addToProvince(Province.REHE, provinces);; }
    }
}
