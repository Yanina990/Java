package com.company;

import java.util.Arrays;

/*Создать класс Cinema с внутренним классом,
 с помощью объектов которого можно хранить информацию об адресах кинотеатров,
  фильмах и времени начала сеансов.
 */
public class Cinema {
    private String name;
    CinemaInfo cinemaInfo;

    public Cinema(String name){
        this.name=name;
    }

     public void setCinemaInfo(CinemaInfo cinemaInfo) {
         this.cinemaInfo = cinemaInfo;
     }

     public String getName() {
         return name;
     }

     public String getStringCinemaInfo(){
        return cinemaInfo.toString();
     }

     public static class CinemaInfo{
        private String adress;
        private Film[] films;
        private String time;

        public CinemaInfo(String adress, Film[] films, String time){
            this.adress=adress;
            this.films=films;
            this.time=time;
        }

         public String getAdress() {
             return adress;
         }

         public Film[] getFilms(){
            return films;
        }

         public String getTime() {
             return time;
         }

         @Override
         public String toString(){
            return "Cinema information:"+"\n"+
                    "\tAdress: "+adress+"\n"+
                    "\tFilm (name): "+ Arrays.toString(films)+"\n"+
                    "\tTime: "+time;
         }
     }

     public class Film {
        private String name;
        private String genre;

        public Film(String name, String genre){
            this.name=name;
            this.genre=genre;
        }

         @Override
         public String toString(){
            return this.name+"("+this.genre+")";
         }

     }
 }
