import Logic.DataModel;
import Logic.UI;

import java.io.IOException;

public class main {
    static DataModel dataModel;
    static UI ui;

    public static void main(String[] args) throws IOException {
        dataModel = new DataModel();
        ui = new UI();

        dataModel.loadJson();

        ui.initTMB();


    }
}
