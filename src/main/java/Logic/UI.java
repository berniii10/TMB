package Logic;

import Data.User;

import java.util.Scanner;

public class UI {
    User user;
    Scanner scanner;

    public UI(){
        user = new User();
        scanner = new Scanner(System.in);
    }

    public User initTMB(){
        
        System.out.println("Benvingut a l'aplicació de TMBJason! Si us plau, introdueix les dades que se't demanen.\n");
        System.out.println("Nom d'usuari:");
        user.setUsername(scanner.nextLine());

        System.out.println("Correu electrònic: ");
        user.setMail(scanner.nextLine());

        System.out.println("Any de naixement:");
        user.setAnyNaixement(scanner.nextInt());

        user.printAllMyData();

        return user;
    }

}
