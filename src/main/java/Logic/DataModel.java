package Logic;

import Data.Localitzacio;
import Data.Ubicacio;
import Tools.Json;

import java.util.ArrayList;

public class DataModel {
    Json json = new Json();
    Ubicacio ubicacio;
    ArrayList<Localitzacio> localitzacions;

    public DataModel(){
        localitzacions = new ArrayList<Localitzacio>();
    }

    public void loadJson(){
        ubicacio = json.loadFileLoc();

        for (int i = 0; i < ubicacio.getLocations().size(); i++){
            if(ubicacio.getLocations().get(i).getArchitect() != null && ubicacio.getLocations().get(i).getCharacteristics() != null){
                //Hotel
                /*
            }else if(){

            }else if(){
                */
            }else{

            }
        }

    }
}
