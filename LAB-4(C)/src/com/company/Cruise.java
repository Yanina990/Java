package com.company;

public class Cruise extends Tour {

    public Cruise(int cost,String transport,boolean food,int numberOfDays) throws  NotNegativeException{
        super(cost,transport,food,numberOfDays);
        if(cost<0){
            throw new NotNegativeException("cost is incorrect!");
        }
        this.type="cruise";
    }

    @Override
    public String toString(){
        return "\n"+"Tour type: "+type+super.toString();
    }
}
