package Tools;

import Data.Localitzacio;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Json {
    Gson gson = new Gson();

    public ArrayList<Localitzacio> loadFile(){
        ArrayList<Localitzacio> locations = new ArrayList<Localitzacio>();

        try(Reader reader = new FileReader("src/main/java/localitzacions.json")){
            locations = gson.fromJson(reader, (Type) Localitzacio.class);
            for(int i = 0; i < locations.size(); i++) {
                System.out.print(locations.get(i));
            }
        }catch (IOException e){
            System.out.println("ERROR al llegir el Gson");
        }
        return locations;
    }

}
