package com.example.ticketing_demo.ds.list;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        System.out.println("stringList = " + stringList);
//        MyList myList = new MyList();
        MyList<String> myList = new MyList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        System.out.println("myList = " + myList);
    }
}

// factory pattern:
