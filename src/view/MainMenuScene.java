package view;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * MainMenuScene.java
 *
 * Purpose:
 */
public final class MainMenuScene extends GameScene
{
    private static final String filepath = "images/pokemon/small_sprites.png";

    private Image sprites;

    /**
     * MainMenuScene ()
     *
     * Purpose:
     */
    public MainMenuScene ()
    {
        super();

    } // MainMenuScene ()


    /**
     *
     */
    @Override
    public void start ()
    {
        this.paintBrush.drawImage(this.sprites, 0,250,50,50,0,0,50,50);
    } // start()


    /**
     *
     */
    @Override
    public void restart ()
    {

    } // restart()

} // final class MainMenuScene
