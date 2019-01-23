package com.example.StringSorter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputWriter {

    public static File writeOutput(List<String> listToWrite) throws Exception {
        File outputFile = null;
        BufferedWriter outputBuffer = null;

        try {
            outputFile = new File("output.csv");

            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }

            outputBuffer = new BufferedWriter(new FileWriter(outputFile));

            // Write output
            int counter = 0;
            for(String item : listToWrite) {
                outputBuffer.write(item);
                counter++;

                if (counter < listToWrite.size())
                    outputBuffer.write(",");
            }
        }
        catch (IOException e)  {
            e.printStackTrace();
        }
        finally {
            if (outputBuffer != null)
                outputBuffer.close();
        }

        return outputFile;
    }
}
