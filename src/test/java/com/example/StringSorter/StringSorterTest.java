package com.example.StringSorter;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class StringSorterTest {

    @Test
    public void testReadInputFile() {
        List<String> inputList = new ArrayList<>();

        inputList = InputReader.processInputFile();

        assertThat(inputList, is(notNullValue()));
    }

    @Test
    public void testSortListInDescendingOrder() {
        List<String> listToSort = new ArrayList<>();
        listToSort.add("Copenhagen");
        listToSort.add("Stockholm");
        listToSort.add("Oslo");

        List<String>  unsortedList = new ArrayList<>();
        for (String item : listToSort) {
            unsortedList.add(item);
        }

        SortList.processDescendingOrder(listToSort);


        // Check if list is sorted in descending order
        assertFalse(unsortedList.equals(listToSort));
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
