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
            for(String item : listToWrite) {
                outputBuffer.write(item);
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
