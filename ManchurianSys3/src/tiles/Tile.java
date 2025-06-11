package tiles;
import java.util.*;

import entities.Pop;
import utilities.*;


public class Tile {   
    private Position gridPos; //stores not the rendered position but the relative position to other tiles in the 2d array. 0,0 being the top left.
    PixelSprite pixelSprite;

    private String name; //optional?? possibly store references to these specifically in some city file or something for easy access? only some are for cities.
    
    private Terrain terrain; //Plains, Mountains, Hills, etcetera. Helps with animation.

    private TreeSet<Pop> pops; //stores all of the pops located in this tile
    private double arableLand; //make a percentage or total? expands over time by a percent;
    private double coalDepo;
    private double ironDepo;
    //private double;
    private int railroad; //level of the railroad like viccy2? has specific animation


    //maybe have a bunch of inner classes or something?

    public Tile () {
        
    }

    public boolean contains(Position position) {
        return pixelSprite.contains(position);
    }

    public void updatePos(Position pos) {
        pixelSprite.updatePos(pos);
    }

}
