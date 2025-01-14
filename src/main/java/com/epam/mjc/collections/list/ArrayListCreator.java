package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        int counter = 1;
        for (String s : sourceList) {
            if (counter % 3 == 0) {
                arrayList.add(s);
                arrayList.add(s);
            }
            counter++;
        }
        return arrayList;
    }
}
