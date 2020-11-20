package model;

/**
 * BaseStats
 *
 * Purpose: Represents the Base Stats that a Pokemon has.
 */
public final class BaseStats
{
    private static final int MINIMUM_STAT_VALUE = 1;


    private int baseHP;
    private int baseAtk;
    private int baseDef;
    private int baseSpAtk;
    private int baseSpDef;
    private int baseSpeed;


    /**
     * BaseStats (int, int, int, int, int, int)
     *
     * Purpose: Creates and initializes BaseStats with the given stat values.
     */
    public BaseStats (final int baseHP, final int baseAtk, final int baseDef,
                      final int baseSpAtk, final int baseSpDef, final int baseSpeed)
    {
        if (baseHP < MINIMUM_STAT_VALUE || baseAtk < MINIMUM_STAT_VALUE || baseDef < MINIMUM_STAT_VALUE ||
            baseSpAtk < MINIMUM_STAT_VALUE || baseSpDef < MINIMUM_STAT_VALUE || baseSpeed < MINIMUM_STAT_VALUE)
            throw new IllegalArgumentException("Base stats must be greater than 0");
        this.baseHP = baseHP;
        this.baseAtk = baseAtk;
        this.baseDef = baseDef;
        this.baseSpAtk = baseSpAtk;
        this.baseSpDef = baseSpDef;
        this.baseSpeed = baseSpeed;
    } // BaseStats (int, int, int, int, int, int)


    /**
     * getBaseHP ()
     *
     * Purpose: Returns the base HP stat.
     */
    public int getBaseHP ()
    {
        return this.baseHP;
    } // getBaseHP ()


    /**
     * getBaseAtk ()
     *
     * Purpose: Returns the base physical attack stat.
     */
    public int getBaseAtk ()
    {
        return this.baseAtk;
    } // getBaseAtk ()


    /**
     * getBaseDef ()
     *
     * Purpose: Returns the base physical defense stat.
     */
    public int getBaseDef ()
    {
        return this.baseDef;
    } // getBaseDef ()


    /**
     * getBaseSpAtk ()
     *
     * Purpose: Returns the base special attack stat.
     */
    public int getBaseSpAtk ()
    {
        return this.baseSpAtk;
    } // getBaseSpAtk ()


    /**
     * getBaseSpDef ()
     *
     * Purpose: Returns the base special defense stat.
     */
    public int getBaseSpDef ()
    {
        return this.baseSpDef;
    } // getBaseSpDef ()


    /**
     * getBaseSpeed ()
     *
     * Purpose: Returns the base speed stat.
     */
    public int getBaseSpeed ()
    {
        return this.baseSpeed;
    } // getBaseSpeed ()


    /**
     * toString ()
     *
     * Purpose: Returns a string containing all of the base stat values.
     */
    public String toString ()
    {
        return String.format("{ baseHP: %d, baseAtk: %d, baseDef: %d, baseSpAtk: %d, baseSpDef: %d, baseSpeed: %d }",
                             this.baseHP, this.baseAtk, this.baseDef, this.baseSpAtk, this.baseSpDef, this.baseSpeed);
    } // toString()

} // final class BaseStats
