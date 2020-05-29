package com.company;

public class Therapy extends Tour {

    public Therapy(int cost,String transport,boolean food,int numberOfDays)throws NotNegativeException{

        super(cost,transport,food,numberOfDays);
        if(cost<0){
            throw new NotNegativeException("cost is incorrect!");
        }
        this.type="therapy";
    }

    @Override
    public String toString(){
        return "\n"+"Tour type: "+type+super.toString();
    }
}
