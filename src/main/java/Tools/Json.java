package Tools;

import PreData.Ubicacio;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Json {
    Gson gson = new Gson();

    public Ubicacio loadFileLoc(){
        Ubicacio locations = new Ubicacio();

        try(Reader reader = new FileReader("src/main/java/localitzacions.json")){
            locations = gson.fromJson(reader,  Ubicacio.class);
        }catch (IOException e){
            System.out.println("ERROR al llegir el Gson");
        }
        return locations;
    }

}
