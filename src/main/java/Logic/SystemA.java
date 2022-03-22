package Logic;

import Data.User;

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
        }
        System.out.println("Vols crear una nova localitzacio? (si/no)");
        action = scanner.nextLine();

        while(!loop) {
            if (action.equals("si")) {
                loop = true;
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
