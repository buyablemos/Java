package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Problem {

    ArrayList<Item> przedmioty;
    HashMap<Integer, Integer> map ;

    int n;
    int seed;
    int lowerBound;
    int upperBound;
    int finalweight=0;
    int finalvalue=0;

    public Problem(int n, int seed, int lowerBound, int upperBound) {
        this.n=n;
        this.seed = seed;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.przedmioty = new ArrayList<>();
        this.map = new HashMap<>();

        int weight;
        int value;


        Random rand = new Random(seed);

        for (int i = 0; i < n; i++) {
            weight = rand.nextInt(upperBound - lowerBound) + lowerBound;
            value = rand.nextInt(upperBound - lowerBound) + lowerBound;
            przedmioty.add(new Item(i,weight, value));
        }

    }

    public String Items_toString(){
        String result="";
        for (int i = 0; i < n; i++) {
            result+=przedmioty.get(i);
        }
        return result;
    }

    public void Solve(int capacity){

        int actualweight=0;
        int actualvalue=0;
        int idx=0;

        przedmioty.sort((item1,item2)->Float.compare(item2.ratio,item1.ratio));

        for (int i = 0; i < n; i++) {
            System.out.printf(przedmioty.get(i).ratio+"|");
        }

        System.out.printf("\n");

        while(actualweight<=capacity&&idx<n){

            if(przedmioty.get(idx).weight+actualweight<=capacity){

                incrementValue(map, idx);
                actualweight+=przedmioty.get(idx).weight;
                actualvalue+=przedmioty.get(idx).value;
            }
            else{
                idx+=1;
            }

        }

        finalweight=actualweight;
        finalvalue=actualvalue;

    }
    public static void incrementValue(HashMap<Integer, Integer> map, Integer key) {
        if (map.containsKey(key)) {
            int newValue = map.get(key) + 1;
            map.put(key, newValue);
        } else {
            map.put(key, 1);
        }
    }

    @Override
    public String toString() {

        String result="--------------------\n";

        for(Integer key : map.keySet()){

            int value=map.get(key);

            for(int i=0; i<value; i++){
                result+=przedmioty.get(key).toString()+"\n";
            }

        }

        result+="--------------------\n";

        result+="Total value: "+finalvalue+"\n";
        result+="Total weight: "+finalweight+"\n";



        return result;

    }
}
