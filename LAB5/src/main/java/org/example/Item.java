package org.example;

public class Item
{
    int id;
    int weight;
    int value;
    float ratio;

    public Item(int id,int weight, int value){
        this.id = id;
        this.weight = weight;
        this.value = value;
        this.ratio= (float) value / (float) weight;
    }

    @Override
    public String toString() {

        return ("Id: "+id+"\tWeight: "+weight+"\tValue: "+value+"\tRatio: "+ratio+"\n");
    }
}
