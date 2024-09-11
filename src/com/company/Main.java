package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CatThread cat = new CatThread();
        CuteThread cuteThread = new CuteThread();

        cat.start();



        while(cat.isAlive()){
            System.out.println(String.format("Creating cat %s/100", cat.getProgress()));
            Thread.sleep(100);
        }

        cat.join();

        cuteThread.setCatList(cat.getCatList());

        cuteThread.start();


        while(cuteThread.isAlive()){
            System.out.println(String.format("Implementing cuteness %s/100", cuteThread.getProgress()));
            Thread.sleep(80);
        }

        cuteThread.join();

        List<Cat> catList = cuteThread.getCatList();

        System.out.println();
        System.out.println("----------");
        System.out.println("Finished making Cats");
        System.out.println("Here are informations:");
        for (int i = 0; i < catList.size(); i++) {
            Cat catInfo = catList.get(i);
            System.out.println("Cat id: " + i);
            System.out.println("Cat age: " + catInfo.age);
            System.out.println("Cat weight: " + catInfo.weight + "Kg");
            System.out.println("Cat height: " + catInfo.height + "cm");
            System.out.println("Cat calculated cuteness: " + catInfo.cuteness);
        }
        System.out.println("----------");
    }
}
