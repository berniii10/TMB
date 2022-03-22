import Data.User;
import Logic.DataModel;
import Logic.SystemA;
import Logic.UI;
import Tools.Json;

import java.io.IOException;

public class main {
    private static DataModel dataModel;
    private static UI ui;
    private static User user;
    private static SystemA systemA;
    private static Json json;

    public static void main(String[] args) {
        int opcio = 0;
        char opcioUser;
        json = new Json();
        dataModel = new DataModel(json);
        ui = new UI();

        user = ui.initTMB();
        dataModel.loadJson();

        systemA = new SystemA(dataModel, user, ui);

        while(opcio != 4){

            opcio = ui.firstMenu();

            switch (opcio){
                case 1:
                    opcioUser = ui.userMenu();
                    switch (opcioUser){
                        case 'a':
                            systemA.myLocations();
                            break;
                        case 'b':
                            break;
                        case 'c':
                            break;
                        case 'd':
                            break;
                        case 'e':
                            break;
                        case 'f':
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Adeu desvirgagallines");
                    break;
            }
        }

    }
}
