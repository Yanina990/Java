package com.company;

public class Excursions extends Tour {

    public Excursions(int cost,String transport,boolean food,int numberOfDays) throws NotNegativeException{
        super(cost,transport,food,numberOfDays);
        if(cost<0){
            throw new NotNegativeException("cost is incorrect!");
        }
        this.type="excursions";
    }


    @Override
    public String toString(){
        return "\n"+"Tour type: "+type+super.toString();
    }
}
