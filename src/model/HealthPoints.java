package model;

/**
 * HealthPoints
 *
 * Purpose: Represents Health Points (HP) that a Pokemon has during battle.
 */
public final class HealthPoints
{
    public static final int ZERO_HP = 0;
    public static final int ONE_HP = 1;


    private int currHP;
    private int maxHP;


    /**
     * HealthPoints (int)
     *
     * Purpose: Creates and initializes HealthPoints with the given level and base HP stat.
     */
    public HealthPoints (final int level, final int baseHP)
    {
        if (level < 1 || baseHP < 1)
            throw new IllegalArgumentException("Level and Base HP stat must be greater than 0");
        this.maxHP = calcHPStat(level, baseHP);
        this.currHP = this.maxHP;
    } // HealthPoints (int)


    /**
     * calcHPStat (int, int)
     *
     * Purpose: Calculates and returns the HP stat with the given level and base HP stat.
     */
    private int calcHPStat (final int level, final int baseHP)
    {
        return ((baseHP * 2 * level) / 100) + level + 10;
    } // calcHPStat (int, int)


    /**
     * getCurrHP ()
     *
     * Purpose: Returns the current HP value.
     */
    public int getCurrHP ()
    {
        return this.currHP;
    } // getCurrHP ()


    /**
     * setCurrHP (int)
     *
     * Purpose: Sets the current HP to the given value. If the given value is negative, the current HP is set
     *      to 0, and if the given value is greater than the max HP, the current HP is set to the max HP value.
     */
    public void setCurrHP (final int newCurrHP)
    {
        this.currHP = newCurrHP < ZERO_HP ? ZERO_HP : newCurrHP > this.maxHP ? this.maxHP : newCurrHP;
    } // setCurrHP (int)


    /**
     * getMaxHP ()
     *
     * Purpose: Returns the max HP value.
     */
    public int getMaxHP ()
    {
        return this.maxHP;
    } // getMaxHP ()


    /**
     * toString ()
     *
     * Purpose: Returns a string containing the current HP and max HP values.
     */
    public String toString ()
    {
        return String.format("%d / %d", this.currHP, this.maxHP);
    } // toString ()

} // final class HealthPoints
