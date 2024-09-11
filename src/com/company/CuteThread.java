package com.company;

import java.util.ArrayList;
import java.util.List;

public class CuteThread extends Thread {
    private int progress;

    List<Cat> catList = new ArrayList<>();

    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            progress = i;
            Cat cat = catList.get(i);
            cat.setCuteness((cat.age + cat.height) / cat.weight);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getProgress(){
        return progress;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    public List<Cat> getCatList() {
        return catList;
    }
}
