package com.company;

/*Туристические  путевки.
  Сформировать набор предложений клиенту по выбору туристической путевки
  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
  Учитывать возможность выбора транспорта, питания и числа дней.
  Реализовать выбор и сортировку путевок.*/

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientTourBooking {

    public static void main(String[] args) throws RuntimeException, NotNegativeException, FileNotFoundException {
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Tour> tour1=new ArrayList<>();
        List<Tour> tour2=new ArrayList<>();
        List<Tour> tour3=new ArrayList<>();

        List<Client> client1=new ArrayList<>();
        List<Client> client2=new ArrayList<>();
        List<Client> client3=new ArrayList<>();

        TourBooking booking=new TourBooking();

        System.out.println("-------------------------------");
        ClientVouchers v1= new ClientVouchers(client1,tour1);
        booking.chooseClient(v1.getClient(),"ann");
        booking.chooseTour(v1.getTour(),"shopping","vacation");
        System.out.println(v1);

        System.out.println("-------------------------------");
        ClientVouchers v2=new ClientVouchers(client2,tour2);
        booking.chooseClient(v2.getClient(),"tom");
        booking.chooseTour(v2.getTour(),"cruise","therapy");
        System.out.println(v2);

        System.out.println("-------------------------------");
        System.out.println("\nВвeдите имя клиента (Tom, Ann, Nik, Jon, Mary): ");
        String client = scan.nextLine();
        System.out.println("Введите вид отдыха (Vacation, Excursions, Therapy, Shopping, Cruise): ");
        String tour = scan.nextLine();
        ClientVouchers v3 = new ClientVouchers(client3, tour3);
        booking.chooseClient(v3.getClient(), ""+client+"");
        booking.chooseTour(v3.getTour(),tour);
        System.out.println(v3);

        System.out.println("-------------------------------");
        booking.sortTourByCost(v2);
        System.out.println(v2);
        
        String fileName = "tourbooking.txt";
        File newFile = new File(fileName);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File has been created");
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-------------------------------");

        Serializator sz = new Serializator();
        boolean b = sz.serialization(tour3.get(0), fileName);
        Tour.food = false;
        Tour res = null;
        try {   res = sz.deserialization(fileName);
        } catch (InvalidObjectException e) {   // обработка
            e.printStackTrace();
        }
        System.out.println(res);


        String[] vvv = {v1.toString(), v2.toString(), v3.toString()};

        try (final FileWriter writer = new FileWriter(fileName, false)) {
            for (String s : vvv) {
                writer.write(s);
                writer.write(System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
