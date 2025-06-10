package game.state;

import controller.*;
import entities.*;
import game.*;
import tiles.TileMap;

import java.awt.Color;
import java.util.*;
import utilities.*;

public class GameState extends State {

    private Game game;
    private TileMap tileMap;
    
    public GameState(Input input, Game game) {
        super(input);
        this.game = game;
        
        tileMap = new TileMap();
    }

    public void update() {
        
    }

    public TileMap getTileMap() {
        return tileMap;
    }

    

}
