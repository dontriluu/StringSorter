package com.example.StringSorter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {


    private static final String DELIMITER = ",";
    private static final String INPUT_FILE = "input.csv";

    public static List<String> processInputFile() {
        Scanner inputScanner = null;
        List<String> inputList = new ArrayList<String>();
        try {

            inputScanner = new Scanner(new File(INPUT_FILE));
            inputScanner.useDelimiter(DELIMITER) ;

            while (inputScanner.hasNext()) {
                inputList.add(inputScanner.next());
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            inputScanner.close();
        }

        return inputList;
    }
}
