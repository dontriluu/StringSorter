package com.example.StringSorter;

import java.util.Collections;
import java.util.List;

public class SortList {

    public static List<String> processDescendingOrder(List<String> listToSort)  {

        // Sort list in descending order
        Collections.sort(listToSort, Collections.reverseOrder());

        return listToSort;
    }
}
