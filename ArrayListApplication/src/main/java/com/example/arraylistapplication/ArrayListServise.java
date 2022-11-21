package com.example.arraylistapplication;

import javafx.fxml.FXML;

import java.util.ArrayList;

public class ArrayListServise {
    private static ArrayList arrayList;

    public ArrayListServise() {
        arrayList = new ArrayList<>();
    }

    public static ArrayList getArrayList() {
        return arrayList;
    }

    public void onAdd(Object value) {
     arrayList.add(value);
    }
    public void onRemove() {

    }

    public void onEdit() {

    }

    public void onClear(Boolean status) {
        if(status == true) {
            arrayList.clear();
        }
    }


    public void onSearch(Boolean stat) {

    }


    public void onSort() {

    }

}
