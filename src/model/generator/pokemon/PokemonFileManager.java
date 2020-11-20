package model.generator.pokemon;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * PokemonFileManager.java
 *
 * Purpose: Manages the Pokemon data file.
 */
public final class PokemonFileManager
{
    private static final String DATA_FILE = "data/pokemon/pokemon_data.csv";
    private static final String UTIL_DATA_DIR = "data/pokemon/util/";
    private static final String OLD_DATA_FILENAME = "old_pokemon_data.csv";
    private static final String LINE_SIZES_FILE = "data/pokemon/util/line_sizes.txt";

    private static final String DELIMITER = ",";
    private static final String PADSPACE = " ";
    private static final String NEWLINE = "\n";
    private static final String READ_MODE = "r";

    private static int bytesInHeaderLine;
    private static int bytesPerLine;
    private static File dataFile;


    /**
     * updateDataFile()
     *
     * Purpose: Call this at the start of the game. Updates the Pokemon data file.
     */
    public static void updateDataFile ()
    {
        try {
            int[] maxSizes = findMaxLineSizes();
            System.out.println(maxSizes[0]);
            System.out.println(maxSizes[1]);

            //backupDataFile();
            //fixDataFile();
            //padDataFile();
        } catch (Exception e) {
            e.printStackTrace();
            revertDataFile();
            System.out.println(DATA_FILE+" was reverted due to error in update.");
        }
        //dataFile = new File(DATA_DIR+DATA_FILENAME);
    } // updateDataFile()


    /**
     *
     */
    public static String[] getData (final int lineNum)
    {
        if (lineNum <= 0)
            throw new IllegalArgumentException();
        String[] retrievedLine = null;
        try {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(dataFile, READ_MODE);
            randomAccessFile.seek(bytesInHeaderLine+((lineNum-1)*bytesPerLine));
            retrievedLine = randomAccessFile.readLine().split(DELIMITER);
            retrievedLine[0] = retrievedLine[0].trim();
            randomAccessFile.close();
        } catch (Exception e) { e.printStackTrace(); }
        return retrievedLine;
    }


    /**
     *
     */
    public static List<String[]> getDataRange (final int lineNum, final int range)
    {
        if (lineNum <= 0 || range <= 0)
            throw new IllegalArgumentException();
        final List<String[]> retrievedLines = new ArrayList<String[]>(range);
        try {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(dataFile, READ_MODE);
            randomAccessFile.seek(bytesInHeaderLine+((lineNum-1)*bytesPerLine));
            for (int i = 0; i < range; i++) {
                final String line = randomAccessFile.readLine();
                if (line != null) {
                    final String[] retrievedLine = line.split(DELIMITER);
                    retrievedLine[0] = retrievedLine[0].trim();
                    retrievedLines.add(retrievedLine);
                }
            }
            randomAccessFile.close();
        } catch (Exception e) { e.printStackTrace(); }
        return retrievedLines;
    }







    /**
     *
     */
    private static void revertDataFile ()
    {
        try {
            final File oldDataFile = new File(UTIL_DATA_DIR+OLD_DATA_FILENAME);
            final BufferedReader br = new BufferedReader(new FileReader(oldDataFile));

            final File revertedDataFile = new File(DATA_FILE);
            final BufferedWriter bw = new BufferedWriter(new FileWriter(revertedDataFile));

            String line;
            while ((line = br.readLine()) != null)
                bw.write(line+"\n");

            br.close();
            bw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }


    /**
     *
     */
    private static void backupDataFile ()
    {
        try {
            final File originalDataFile = new File(DATA_FILE);
            final BufferedReader br = new BufferedReader(new FileReader(originalDataFile));

            final File oldDataFile = new File(UTIL_DATA_DIR+OLD_DATA_FILENAME);
            final BufferedWriter bw = new BufferedWriter(new FileWriter(oldDataFile));

            String line;
            while ((line = br.readLine()) != null)
                bw.write(line+"\n");

            br.close();
            bw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }


    /**
     *
     */
    private int[] getLineSizes ()
    {
        try {
            final File lineSizesFile = new File(LINE_SIZES_FILE);
            final BufferedReader br = new BufferedReader(new FileReader(lineSizesFile));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    /**
     *
     */
    private static int[] findMaxLineSizes ()
    {
        final int[] maxLineSizes = new int[2];
        try {
            final File originalDataFile = new File(DATA_FILE);
            final BufferedReader br = new BufferedReader(new FileReader(originalDataFile));
            maxLineSizes[0] = br.readLine().length()+1;
            String line;
            int maxSize = 0;
            while ((line = br.readLine()) != null)
                maxSize = line.length() > maxSize ? line.length() : maxSize;
            maxLineSizes[1] = maxSize+1;
            br.close();
        } catch (Exception e) { e.printStackTrace(); }
        return maxLineSizes;
    }


    /**
     *
     */
    private static void padDataFile ()
    {
        try {
            /*
            final File oldDataFile = new File(UTIL_DATA_DIR+OLD_DATA_FILENAME);
            final BufferedReader br = new BufferedReader(new FileReader(oldDataFile));

            final File newDataFile = new File(DATA_DIR+DATA_FILENAME);
            final BufferedWriter bw = new BufferedWriter(new FileWriter(newDataFile));

            // Skip/Write the header line
            final String headerLine = br.readLine()+NEWLINE;
            bytesInHeaderLine = headerLine.length();
            bw.write(headerLine);
            */

            // Pad file
            /*
            int[] columnMaxSizes = findColumnMaxSizes();
            String line;
            while ((line = br.readLine()) != null)
            {
                final String[] lineParts = line.split(DELIMITER);
                int numSpaces = 0;
                for (int col = 0; col < lineParts.length; col++)
                    numSpaces += columnMaxSizes[col] - lineParts[col].length();
                for (int i = 0; i < numSpaces; i++)
                    lineParts[0] += PADSPACE;
                final StringBuilder newLineBuilder = new StringBuilder();
                for (int col = 0; col < lineParts.length; col++)
                {
                    if (col != lineParts.length-1)
                        lineParts[col] = lineParts[col] + DELIMITER;
                    else
                        lineParts[col] = lineParts[col] + NEWLINE;
                    newLineBuilder.append(lineParts[col]);
                }
                final String newLine = newLineBuilder.toString();
                bytesPerLine = newLine.length();
                bw.write(newLine);
            }
            */
            //br.close();
            //bw.close();
        } catch (Exception e) { e.printStackTrace(); }
    } // padDataFile()

} // final class PokemonFileManager
