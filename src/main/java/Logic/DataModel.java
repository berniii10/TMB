package Logic;

import Data.*;
import PreData.Ubicacio;
import Tools.Json;

import java.util.ArrayList;

public class DataModel {
    Json json = new Json();
    Ubicacio ubicacio;
    ArrayList<Localitzacio> localitzacions;
    ArrayList<Hotel> hotels;
    ArrayList<Monument> monuments;
    ArrayList<Restaurant> restaurants;

    public DataModel(){
        localitzacions = new ArrayList<Localitzacio>();
        hotels = new ArrayList<Hotel>();
        monuments = new  ArrayList<Monument>();
        restaurants = new ArrayList<Restaurant>();
    }

    public void loadJson(){
        ubicacio = json.loadFileLoc();

        for (int i = 0; i < ubicacio.getLocations().size(); i++){
            if(ubicacio.getLocations().get(i).getStars() != 0){
                //Hotel
                hotels.add(new Hotel(ubicacio.getLocations().get(i).getName(), ubicacio.getLocations().get(i).getCoordinates(), ubicacio.getLocations().get(i).getDescription(), ubicacio.getLocations().get(i).getStars()));
            }else if(ubicacio.getLocations().get(i).getCharacteristics() != null){
                //Restaurant
                restaurants.add(new Restaurant(ubicacio.getLocations().get(i).getName(), ubicacio.getLocations().get(i).getCoordinates(), ubicacio.getLocations().get(i).getDescription(), ubicacio.getLocations().get(i).getCharacteristics()));
            }else if(ubicacio.getLocations().get(i).getArchitect() != null){
                //Monument
                monuments.add(new Monument(ubicacio.getLocations().get(i).getName(), ubicacio.getLocations().get(i).getCoordinates(), ubicacio.getLocations().get(i).getDescription(), ubicacio.getLocations().get(i).getArchitect(), ubicacio.getLocations().get(i).getInauguration()));
            }else{
                localitzacions.add(new Localitzacio(ubicacio.getLocations().get(i).getName(), ubicacio.getLocations().get(i).getCoordinates(), ubicacio.getLocations().get(i).getDescription()));
            }
        }
    }

    public void printAllaData(){
        System.out.println();
        System.out.println("Restaurants: --");
        System.out.println();

        for(Restaurant r: restaurants){
            System.out.println(r.getName());
            System.out.println(r.getDescription());
            System.out.println(r.getCoordinates());
            System.out.println(r.getCharacteristics());
        }

        System.out.println();
        System.out.println("Hotels: --");
        System.out.println();

        for(Hotel h: hotels){
            System.out.println(h.getName());
            System.out.println(h.getDescription());
            System.out.println(h.getCoordinates());
            System.out.println(h.getStars());
        }

        System.out.println();
        System.out.println("Monuments: --");
        System.out.println();

        for(Monument m: monuments){
            System.out.println(m.getName());
            System.out.println(m.getDescription());
            System.out.println(m.getCoordinates());
            System.out.println(m.getArchitect());
            System.out.println(m.getInauguration());
        }
        System.out.println();
        System.out.println("Localitzacions: --");
        System.out.println();

        for(Localitzacio l: localitzacions){
            System.out.println(l.getName());
            System.out.println(l.getDescription());
            System.out.println(l.getCoordinates());
        }
    }

}
