package display;

import java.awt.*;
import java.awt.Graphics;

import entities.*;
import game.Game;
import game.state.*;

import tiles.TileMap;

public class Renderer {
    //color pallete
    private static Color dullAzure = new Color(1, 27, 50);

    private Graphics graphics;

    public void render(State state, Graphics graphics) {
        if (state instanceof MenuState) {
            //graphics.setColor(new Color(250,248,239)); light beige
            graphics.setColor(Color.black);
            graphics.fillRect(0, 0, 800, 600);
        } else if (state instanceof GameState) {
            TileMap tileMap = ((GameState)state).getTileMap();
            renderTiles(graphics, tileMap);
        } 
    }

    public void renderTiles(Graphics graphics, TileMap tileMap) {
        Tile[][] tileGrid = tileMap.getTileGrid();
        for (int row = 0; row < tileGrid.length; row++) {
            for (int col = 0; col < tileGrid[row].length; col++) {
                if (tileGrid[row][col] != null) {
                    graphics.setColor(Color.RED);

                    graphics.fillRect(col*30,row*30,25, 25);
                }
            }
        }
    }
}
