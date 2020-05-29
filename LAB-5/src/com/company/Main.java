package com.company;
//package com.company.
//import com.company.Cinema.Film;
public class Main {
    public static Cinema.Film[] createFilm(Cinema cinema) {
        Cinema.Film prod1 = cinema.new Film("Любовь и голуби", "комедия");
        Cinema.Film prod2 = cinema.new Film("Москва слезам не верит", "драма");
        return new Cinema.Film[]{prod1, prod2};
    }

    public static Cinema.CinemaInfo createCinemaInfo(Cinema cinema){
       return new Cinema.CinemaInfo("ул. Пушкинская 24", createFilm(cinema), "19:30");
    }

    public static void showAnonymousClass(){
        Cinema anon=new Cinema("Октябрь"){
            public String getStringCinemaInfo(){
                return "Showing anonymous class";}
            };
            System.out.println(anon.getStringCinemaInfo());
    }
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Октябрь");
        cinema.setCinemaInfo(createCinemaInfo(cinema));
        showAnonymousClass();
        System.out.println(cinema.getStringCinemaInfo());
    }
}
