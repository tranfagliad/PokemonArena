package model;

/**
 * BattleStats
 *
 * Purpose: Represents the stats that a Pokemon has in battle.
 */
public class BattleStats
{
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int speed;


    /**
     * BattleStats (int, BaseStats)
     *
     * Purpose: Creates and initializes BattleStats with the given level and base stats.
     */
    public BattleStats (final int level, final BaseStats baseStats)
    {
        if (level < 1)
            throw new IllegalArgumentException("Level must be greater than 0");
        this.atk = calcStat(level, baseStats.getBaseAtk());
        this.def = calcStat(level, baseStats.getBaseDef());
        this.spAtk = calcStat(level, baseStats.getBaseSpAtk());
        this.spDef = calcStat(level, baseStats.getBaseSpDef());
        this.speed = calcStat(level, baseStats.getBaseSpeed());
    } // BattleStats (int, BaseStats)


    /**
     * calcStat (int, int)
     *
     * Purpose: Calculates and returns the stat value with the given level and base stat.
     */
    private int calcStat (final int level, final int baseStat)
    {
        return ((baseStat * 2 * level) / 100) + 5;
    } // calcStat (int, int)


    /**
     * getAtk ()
     *
     * Purpose: Returns the physical attack stat.
     */
    public int getAtk ()
    {
        return this.atk;
    } // getAtk ()


    /**
     * getDef ()
     *
     * Purpose: Returns the physical defense stat.
     */
    public int getDef ()
    {
        return this.def;
    } // getDef ()


    /**
     * getSpAtk ()
     *
     * Purpose: Returns the special attack stat.
     */
    public int getSpAtk ()
    {
        return this.spAtk;
    } // getSpAtk ()


    /**
     * getSpDef ()
     *
     * Purpose: Returns the special defense stat.
     */
    public int getSpDef ()
    {
        return this.spDef;
    } // getSpDef ()


    /**
     * getSpeed ()
     *
     * Purpose: Returns the speed stat.
     */
    public int getSpeed ()
    {
        return this.speed;
    } // getSpeed ()


    /**
     * toString ()
     *
     * Purpose: Returns a string containing all of the battle stats.
     */
    public String toString ()
    {
        return String.format("{ atk: %d, def: %d, spAtk: %d, spDef: %d, speed: %d }",
                             this.atk, this.def, this.spAtk, this.spDef, this.speed);
    } // toString ()

} // class BattleStats
