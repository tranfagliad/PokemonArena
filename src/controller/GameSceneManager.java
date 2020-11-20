package controller;

import view.GameScene;
import java.util.Stack;

/**
 * GameSceneManager.java
 *
 * Purpose: Provides an interface to manage game scenes.
 *      The scenes are managed in a Stack structure.
 */
public final class GameSceneManager
{
    private static Stack<GameScene> scenes = new Stack<>();

    /**
     * getActiveScene()
     *
     * Purpose: Returns the active scene.
     */
    public static GameScene getActiveScene ()
    {
        return scenes.peek();
    } // getActiveScene()


    /**
     * getPreviousScene()
     *
     * Purpose: If there are at least 2 scenes in the stack, the size()-2 scene is returned.
     *      Otherwise, null is returned.
     */
    public static GameScene getPreviousScene ()
    {
        return scenes.size() > 1 ? scenes.get(scenes.size()-2) : null;
    } // getPreviousScene()


    /**
     * addScene()
     *
     * Purpose: Pushes a new GameScene to the stack of scenes.
     */
    public static void addScene (GameScene newScene)
    {
        newScene.setWidth(PokemonArena.getWindowWidth());
        newScene.setHeight(PokemonArena.getWindowHeight());
        scenes.add(newScene);
    } // addScene()


    /**
     * removeActiveScene()
     *
     * Purpose: Removes the active scene from the stack of scenes.
     */
    public static void removeActiveScene ()
    {
        scenes.pop();
    } // removeActiveScene()

} // final class GameSceneManager
