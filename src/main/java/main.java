import Logic.DataModel;
import Tools.Json;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        DataModel dataModel = new DataModel();
        Json json = new Json();

        json.loadFile();
    }
}
