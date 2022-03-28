package Logic;

import Data.Localitzacio;
import Data.User;

import java.util.Locale;
import java.util.Scanner;

public class SystemA {

    private SubSystemA subSystemA;
    private DataModel dataModel;
    private User user;
    private UI ui;
    private Scanner scanner;

    public SystemA(DataModel dataModel, User user, UI ui){
        this.dataModel = dataModel;
        this.user = user;
        this.ui = ui;
        subSystemA = new SubSystemA();
        scanner = new Scanner(System.in);
    }

    public void myLocations(){
        boolean loop = false;
        String action;
        if (user.getLocalitzacions().size() == 0){
            System.out.println("No tens cap localització creada\n");
        }else{
            System.out.println();
            for(int i = 0; i < user.getLocalitzacions().size(); i++){
                user.getLocalitzacions().get(i).printAllData();
            }
        }
        System.out.println("Vols crear una nova localitzacio? (si/no)");

        action = scanner.nextLine();
        action.toLowerCase(Locale.getDefault());
        System.out.println(action);

        while(!loop) {
            if (action.equals("si")) {
                loop = true;
                Localitzacio loc = new Localitzacio();
                System.out.println("Nom de la localitzacio: ");
                loc.setName(scanner.nextLine());
                System.out.println("\nLongitud: ");
                loc.set1stCoordinate(scanner.nextFloat());
                System.out.println("\nLatitud: ");
                loc.set2stCoordinate(scanner.nextFloat());

                scanner.nextLine();

                System.out.println("\nDescripcio: ");
                loc.setName(scanner.nextLine());

                user.getLocalitzacions().add(loc);

                for(int i = 0; i < user.getLocalitzacions().size(); i++){
                    user.getLocalitzacions().get(i).printAllData();
                }

            }else if(action.equals("no")){
                loop = true;
            }else{
                System.out.println("ERROR! S'ha d'introduir 'si' o 'no'.");
                System.out.println("Vols crear una nova localitzacio? (si/no)");
                action = scanner.nextLine();
            }
        }
    }

}
