package game;
import java.awt.*;
import java.util.*;

import display.Display;
import entities.*;
import game.state.*;
import controller.*;
import tiles.*;

public class Game {

    private Display display;
    private Input input;
    private State currentState;
    private MenuState menuState;
    private GameState gameState;

    public Game(int width, int height) {
        Input input = new Input();
        display = new Display(width, height, input);
        gameState = new GameState(input, this);
        currentState = gameState;
    }

    public void update(){
        currentState.update();
    }
    public void render(){display.render(currentState);}
}
