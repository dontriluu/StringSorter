package com.example.StringSorter;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class StringSorterTest {

    @Test
    public void testReadInputFile() {
        List<String> inputList = new ArrayList<String>();

        inputList = InputReader.processInputFile();

        assertThat(inputList, is(notNullValue()));
    }

    @Test
    public void testSortData() {

    }

    @Test
    public void testWriteOutputFile() {

    }

}
