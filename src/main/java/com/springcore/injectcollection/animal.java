package com.springcore.injectcollection;

import java.util.ArrayList;

public class animal {
    ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "animal{" +
                "list=" + list +
                '}';
    }
}


