package tiles;

import utilities.*;

import java.util.*;
import entities.*;

public class TileMap {
    private Tile[][] tileGrid;
    private HashMap<Province, ArrayList<Tile>> provinces;

    public TileMap() {
        tileGrid = new Tile[27][23]; //27 tall, 23 wide.
        provinces = new HashMap<>();
        TileInitializer.initializeTiles(tileGrid, provinces);
    }
    
    public HashMap<Province, ArrayList<Tile>> getProvinces() {
        return provinces;
    }

    public Tile[][] getTileGrid() {
        return tileGrid;
    }
}
