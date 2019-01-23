package com.example.StringSorter;

import java.io.File;
import java.util.List;

public class StringSorter {


    public static void main(String[] args) {
        List<String> inputList = InputReader.processInputFile();

        try {
            SortList.processDescendingOrder(inputList);
            File outputFile = OutputWriter.writeOutput(inputList);
        }
        catch (Exception e)   {
            e.printStackTrace();
        }
    }

}
