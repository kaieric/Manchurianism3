package tiles;

import utilities.*;
import java.awt.*;

public class TileSprites {

    public static PixelSprite tileYellow;
    public static PixelSprite tileTerrain;
    
    static {
        Color [] sprtPallete = {new Color(254,209,0,255)};
        Integer[][] pxIntegers = new Integer[1][1];
        pxIntegers[0][0] = 0;
        tileYellow = new PixelSprite(pxIntegers, 20, new Position(0,0), sprtPallete);
    }

    public TileSprites() {
    }

}
