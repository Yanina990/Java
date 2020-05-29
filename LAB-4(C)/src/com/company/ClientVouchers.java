package com.company;

import java.io.Serializable;
import java.util.List;

public class ClientVouchers implements Serializable {

    private List<Client> clients;
    private List<Tour> tours;
    private static final long serialVersionUID = 1L;
    public ClientVouchers(List<Client> clients, List<Tour> tours){
        this.clients=clients;
        this.tours=tours;
    }

    public List<Client> getClient(){
        return clients;
    }
    public void setClient(List<Client> clients){
        this.clients=clients;
    }

    public List<Tour> getTour(){
        return tours;
    }
    public void setTour(List<Tour> tours){
        this.tours=tours;
    }


    @Override
    public String toString(){
        StringBuilder clientDescription=new StringBuilder(clients.get(0).toString());
        if(!tours.isEmpty()){
            clientDescription.append("\n").append(clients.get(0).getClientName()).append("'s tours:");
            for(Tour tour:tours){
                clientDescription.append(tour.toString());
            }
        }
        return new String(clientDescription);
    }
}
