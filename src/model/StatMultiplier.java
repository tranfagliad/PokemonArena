package model;

/**
 * StatMultiplier
 *
 * Purpose: Calculates the stat multipliers used in battle.
 */
public class StatMultiplier
{
    /**
     * atkMultiplier (StatStages)
     *
     * Purpose: Returns the stat multiplier for the physical attack stat.
     */
    public static double atkMultiplier (final StatStages statStages)
    {
        final int numerator = statStages.getAtkStage() > 0 ? statStages.getAtkStage() + 2 : 2;
        final int denominator = statStages.getAtkStage() < 0 ? -statStages.getAtkStage() + 2 : 2;
        return (double)(numerator / denominator);
    } // atkMultiplier (StatStages)


    /**
     * defMultiplier (StatStages)
     *
     * Purpose: Returns the stat multiplier for the physical defense stat.
     */
    public static double defMultiplier (final StatStages statStages)
    {
        final int numerator = statStages.getDefStage() > 0 ? statStages.getDefStage() + 2 : 2;
        final int denominator = statStages.getDefStage() < 0 ? -statStages.getDefStage() + 2 : 2;
        return (double)(numerator / denominator);
    } // defMultiplier (StatStages)


    /**
     * spAtkMultiplier (StatStages)
     *
     * Purpose: Returns the stat multiplier for the special attack stat.
     */
    public static double spAtkMultiplier (final StatStages statStages)
    {
        final int numerator = statStages.getSpAtkStage() > 0 ? statStages.getSpAtkStage() + 2 : 2;
        final int denominator = statStages.getSpAtkStage() < 0 ? -statStages.getSpAtkStage() + 2 : 2;
        return (double)(numerator / denominator);
    } // spAtkMultiplier (StatStages)


    /**
     * spDefMultiplier (StatStages)
     *
     * Purpose: Returns the stat multiplier for the special defense stat.
     */
    public static double spDefMultiplier (final StatStages statStages)
    {
        final int numerator = statStages.getSpDefStage() > 0 ? statStages.getSpDefStage() + 2 : 2;
        final int denominator = statStages.getSpDefStage() < 0 ? -statStages.getSpDefStage() + 2 : 2;
        return (double)(numerator / denominator);
    } // spDefMultiplier (StatStages)


    /**
     * speedMultiplier (StatStages)
     *
     * Purpose: Returns the stat multiplier for the speed stat.
     */
    public static double speedMultiplier (final StatStages statStages)
    {
        final int numerator = statStages.getSpeedStage() > 0 ? statStages.getSpeedStage() + 2 : 2;
        final int denominator = statStages.getSpeedStage() < 0 ? -statStages.getSpeedStage() + 2 : 2;
        return (double)(numerator / denominator);
    } // speedMultiplier (StatStages)


    /**
     * accMultiplier (StatStages)
     *
     * Purpose: Returns the stat multiplier for the accuracy stat.
     */
    public static double accMultiplier (final StatStages statStages)
    {
        final int numerator = statStages.getAccStage() > 0 ? statStages.getAccStage() + 3 : 3;
        final int denominator = statStages.getAccStage() < 0 ? -statStages.getAccStage() + 3 : 3;
        return (double)(numerator / denominator);
    } // accMultiplier (StatStages)


    /**
     * evaMultiplier (StatStages)
     *
     * Purpose: Returns the stat multiplier for the evasion stat.
     */
    public static double evaMultiplier (final StatStages statStages)
    {
        final int numerator = statStages.getEvaStage() > 0 ? statStages.getEvaStage() + 3 : 3;
        final int denominator = statStages.getEvaStage() < 0 ? -statStages.getEvaStage() + 3 : 3;
        return (double)(numerator / denominator);
    } // evaMultiplier (StatStages)

} // class StatMultiplier
