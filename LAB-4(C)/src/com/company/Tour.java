package com.company;


import java.io.Serializable;

public abstract class Tour implements Serializable {
    public static boolean food;
    public String type;
    private transient String transport;
    //private boolean food;
    private int numberOfDays;
    private int cost;
    private static final long serialVersionUID = 1L;

    public Tour(int cost,String transport,boolean nfood,int numberOfDays) throws NotNegativeException{
        if(cost<0){
            throw new NotNegativeException("cost is incorrect!");
        }
        this.cost = cost;
        this.transport=transport;
        food=nfood;
        this.numberOfDays=numberOfDays;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean getFood(){
        return food;
    }

    public String getTransport(){
        return transport;
    }
    public void setTransport(String transport) {
        this.transport=transport;
    }
    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }

    public int getNumberOfDays(){
        return numberOfDays;
    }

    public void setFood(boolean nfood){
        food=nfood;
    }
    public void setNumberOfDays(int numberOfDays){
        this.numberOfDays=numberOfDays;
    }

    @Override
    public String toString() {
        return " |Transport: "+transport+" |Food : "+food+" |Number of days: "+numberOfDays+" |Cost: " + cost + ".";
    }
}
