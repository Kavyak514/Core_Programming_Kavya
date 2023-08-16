package com.codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.List;

class DataObject {
    private String name;
    private String date;

    public DataObject(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}

public class FilterByNameExample {
    public static void main(String[] args) {
        List<DataObject> dataList = new ArrayList<>();
        dataList.add(new DataObject("Alice", "2023-08-16"));
        dataList.add(new DataObject("Bob", "2023-08-17"));
        dataList.add(new DataObject("Alice", "2023-08-18"));
        dataList.add(new DataObject("Charlie", "2023-08-19"));

        String filterName = "Alice";
        List<DataObject> filteredList = new ArrayList<>();
        for (DataObject dataObject : dataList) {
            if (dataObject.getName().equals(filterName)) {
                filteredList.add(dataObject);
            }
        }
        System.out.println("Objects filtered by name '" + filterName + "':");
        for (DataObject data : filteredList) {
            System.out.println("Name: " + data.getName() + ", Date: " + data.getDate());
        }
    }
}
