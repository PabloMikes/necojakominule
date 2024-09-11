package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CatThread extends Thread{

    private int progress;

    List<Cat> catList = new ArrayList<>();

    Random rn = new Random();

    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            progress = i;
            Cat cat = new Cat();
            cat.setAge(rn.nextInt(10)+1);
            cat.setHeight(rn.nextInt(50)+1);
            cat.setWeight(rn.nextInt(8)+1);
            catList.add(cat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getProgress(){
        return progress;
    }

    public List<Cat> getCatList() {
        return catList;
    }
}
