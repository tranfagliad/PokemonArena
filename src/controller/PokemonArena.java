package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.generator.pokemon.PokemonFileManager;
import view.GameScene;
import view.MainMenuScene;

/**
 * PokemonArena.java
 *
 * Purpose: The central module of the Pokemon Arena game.
 */
public final class PokemonArena extends Application
{
    private static final String WINDOW_TITLE = "Pokemon Arena";

    private static final double WINDOW_WIDTH = 50;
    private static final double WINDOW_HEIGHT = 50;

    private static Pane root;


    /**
     * main()
     *
     * Purpose: Launches the application.
     */
    public static void main (final String[] args)
    {
        //Application.launch();
        PokemonFileManager.updateDataFile();
    } // main()


    /**
     * start()
     *
     * Purpose: Initializes and starts the game.
     */
    @Override
    public void start(final Stage window) throws Exception
    {
        initWindow(window);
        goToNextScene(new MainMenuScene());
        window.show();
    } // start()


    /**
     * initWindow()
     *
     * Purpose: Initializes the game window.
     */
    private static void initWindow (final Stage window)
    {
        root = new Pane();
        final Scene scene = new Scene(root);
        window.setTitle(WINDOW_TITLE);
        window.setWidth(WINDOW_WIDTH);
        window.setHeight(WINDOW_HEIGHT);
        window.initStyle(StageStyle.UNDECORATED);
        window.setScene(scene);
    } // initWindow()


    /**
     * getWindowWidth()
     *
     * Purpose: Returns the window width.
     */
    public static double getWindowWidth ()
    {
        return WINDOW_WIDTH;
    } // getWindowWidth()


    /**
     * getWindowHeight()
     *
     * Purpose: Returns the window height.
     */
    public static double getWindowHeight ()
    {
        return WINDOW_HEIGHT;
    } // getWindowHeight()


    /**
     * goToNextScene()
     *
     * Purpose: Starts the given next scene.
     */
    public static void goToNextScene (final GameScene nextScene)
    {
        GameSceneManager.addScene(nextScene);
        root.getChildren().add(nextScene);
        GameSceneManager.getActiveScene().start();
    } // goToNextScene();


    /**
     * goToPreviousScene()
     *
     * Purpose: Returns back to the previous scene.
     */
    public static void goToPreviousScene ()
    {
        GameSceneManager.removeActiveScene();
        root.getChildren().remove(root.getChildren().size()-1);
        GameSceneManager.getActiveScene().restart();
    } // goToPreviousScene()

} // final class PokemonArena
