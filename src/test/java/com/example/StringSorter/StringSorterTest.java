package com.example.StringSorter;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


public class StringSorterTest {

    @Test
    public void testReadInputFile() {
        List<String> inputList = new ArrayList<>();

        inputList = InputReader.processInputFile();

        assertThat(inputList, is(notNullValue()));
    }


    @Test
    public void testWriteOutputFile() {
        List<String>  outputList = new ArrayList<>();

        try {
            File outputFile = OutputWriter.writeOutput(outputList);
            assertThat(outputFile, is(notNullValue()));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
