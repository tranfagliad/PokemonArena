package model;

/**
 * StatStages
 *
 * Purpose: Represents the stat change stages of a Pokemon during battle.
 *      The minimum stage is -6, the maximum stage is 6, and the default stage is 0.
 */
public class StatStages
{
    public static final int DEFAULT_STAGE = 0;
    public static final int MIN_STAGE = -6;
    public static final int MAX_STAGE = 6;


    private int atkStage;
    private int defStage;
    private int spAtkStage;
    private int spDefStage;
    private int speedStage;
    private int accStage;
    private int evaStage;


    /**
     * StatStageMultipliers ()
     *
     * Purpose: Creates and initializes StatStages where all the stages are set to 0.
     */
    public StatStages ()
    {
        this.atkStage = DEFAULT_STAGE;
        this.defStage = DEFAULT_STAGE;
        this.spAtkStage = DEFAULT_STAGE;
        this.spDefStage = DEFAULT_STAGE;
        this.speedStage = DEFAULT_STAGE;
        this.accStage = DEFAULT_STAGE;
        this.evaStage = DEFAULT_STAGE;
    } // StatStageMultipliers ()


    /**
     * getNewStage (int)
     *
     * Purpose: Given a new stage value, the return value is filtered between MIN_STAGE and MAX_STAGE.
     */
    private int getNewStage (final int newStage)
    {
        return newStage < MIN_STAGE ? MIN_STAGE : newStage > MAX_STAGE ? MAX_STAGE : newStage;
    } // getNewStage (int)


    /**
     * getAtkStage ()
     *
     * Purpose: Returns the physical attack stat stage.
     */
    public int getAtkStage ()
    {
        return this.atkStage;
    } // getAtkStage ()


    /**
     * setAtkStage (int)
     *
     * Purpose: Sets the physical attack stage to a new value between MIN_STAGE and MAX_STAGE.
     *      If the value changes, this method returns true. If the value did not change, this
     *      method returns false.
     */
    public boolean setAtkStage (final int newAtkStage)
    {
        final int oldValue = this.atkStage;
        this.atkStage = getNewStage(newAtkStage);
        return this.atkStage != oldValue;
    } // setAtkStage (int)


    /**
     * getDefStage ()
     *
     * Purpose: Returns the physical defense stat stage.
     */
    public int getDefStage ()
    {
        return this.defStage;
    } // getDefStage ()


    /**
     * setDefStage (int)
     *
     * Purpose: Sets the physical defense stage to a new value between MIN_STAGE and MAX_STAGE.
     *      If the value changes, this method returns true. If the value did not change, this
     *      method returns false.
     */
    public boolean setDefStage (final int newDefStage)
    {
        final int oldValue = this.defStage;
        this.defStage = getNewStage(newDefStage);
        return this.defStage != oldValue;
    } // setDefStage (int)


    /**
     * getSpAtkStage ()
     *
     * Purpose: Returns the special attack stat stage.
     */
    public int getSpAtkStage ()
    {
        return this.spAtkStage;
    } // getSpAtkStage ()


    /**
     * setSpAtkStage (int)
     *
     * Purpose: Sets the special attack stage to a new value between MIN_STAGE and MAX_STAGE.
     *      If the value changes, this method returns true. If the value did not change, this
     *      method returns false.
     */
    public boolean setSpAtkStage (final int newSpAtkStage)
    {
        final int oldValue = this.spAtkStage;
        this.spAtkStage = getNewStage(newSpAtkStage);
        return this.spAtkStage != oldValue;
    } // setAtkStage (int)


    /**
     * getSpDefStage ()
     *
     * Purpose: Returns the special defense stat stage.
     */
    public int getSpDefStage ()
    {
        return this.spDefStage;
    } // getSpDefStage ()


    /**
     * setSpDefStage (int)
     *
     * Purpose: Sets the special defense stage to a new value between MIN_STAGE and MAX_STAGE.
     *      If the value changes, this method returns true. If the value did not change, this
     *      method returns false.
     */
    public boolean setSpDefStage (final int newSpDefStage)
    {
        final int oldValue = this.spDefStage;
        this.spDefStage = getNewStage(newSpDefStage);
        return this.spDefStage != oldValue;
    } // setSpDefStage (int)


    /**
     * getSpeedStage ()
     *
     * Purpose: Returns the speed stat stage.
     */
    public int getSpeedStage ()
    {
        return this.speedStage;
    } // getSpeedStage ()


    /**
     * setSpeedStage (int)
     *
     * Purpose: Sets the speed stage to a new value between MIN_STAGE and MAX_STAGE.
     *      If the value changes, this method returns true. If the value did not change, this
     *      method returns false.
     */
    public boolean setSpeedStage (final int newSpeedStage)
    {
        final int oldValue = this.speedStage;
        this.speedStage = getNewStage(newSpeedStage);
        return this.speedStage != oldValue;
    } // setSpeedStage (int)


    /**
     * getAccStage ()
     *
     * Purpose: Returns the accuracy stage.
     */
    public int getAccStage ()
    {
        return this.accStage;
    } // getAccStage ()


    /**
     * setAccStage (int)
     *
     * Purpose: Sets the accuracy stage to a new value between MIN_STAGE and MAX_STAGE.
     *      If the value changes, this method returns true. If the value did not change, this
     *      method returns false.
     */
    public boolean setAccStage (final int newAccStage)
    {
        final int oldValue = this.accStage;
        this.accStage = getNewStage(newAccStage);
        return this.accStage != oldValue;
    } // setAccStage (int)


    /**
     * getEvaStage ()
     *
     * Purpose: Returns the evasion stage.
     */
    public int getEvaStage ()
    {
        return this.evaStage;
    } // getEvaStage ()


    /**
     * setEvaStage (int)
     *
     * Purpose: Sets the evasion stage to a new value between MIN_STAGE and MAX_STAGE.
     *      If the value changes, this method returns true. If the value did not change, this
     *      method returns false.
     */
    public boolean setEvaStage (final int newEvaStage)
    {
        final int oldValue = this.evaStage;
        this.evaStage = getNewStage(newEvaStage);
        return this.evaStage != oldValue;
    } // setEvaStage (int)


    /**
     * toString ()
     *
     * Purpose: Returns a string containing all of the stat stage values.
     */
    public String toString ()
    {
        return String.format("{ atkStage: %d, defStage: %d, spAtkStage: %d, spDefStage: %d, speedStage: %d, accStage: %d, evaStage: %d }",
                             this.atkStage, this.defStage, this.spAtkStage, this.spDefStage, this.speedStage, this.accStage, this.evaStage);
    } // toString ()

} // class StatStageMultipliers
