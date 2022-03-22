package Logic;

import Data.User;

import java.util.Scanner;

public class UI {
    private User user;
    private Scanner scanner;

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
        System.out.println();
        //user.printAllMyData();

        return user;
    }

    public int firstMenu(){
        int opcio = 0;
        System.out.println("1. Gestió d'usuari");
        System.out.println("2. Buscar localitzacions");
        System.out.println("3. Planejar ruta");
        System.out.println("4. Temps d'espera del bus");
        System.out.println("5. Sortir\n");
        System.out.println("Selecciona una opcio: ");

        opcio = scanner.nextInt();

        while (opcio < 1 || opcio > 5){
            System.out.println("ERROR: Introdueix una opcio entre 1 i 5 gandul\n");
            System.out.println("1. Gestió d'usuari");
            System.out.println("2. Buscar localitzacions");
            System.out.println("3. Planejar ruta");
            System.out.println("4. Temps d'espera del bus");
            System.out.println("5. Sortir\n");
            System.out.println("Selecciona una opcio: ");
            opcio = scanner.nextInt();
        }
        return opcio;
    }

    public char userMenu(){
        String opcio;
        System.out.println("a) Les meves localitzacions");
        System.out.println("b) Historial de localitzacions");
        System.out.println("c) Les meves rutes");
        System.out.println("d) Parades i estacions preferides");
        System.out.println("e) Estacions inaugurades el meu any de naixement");
        System.out.println("f) Tornar al menú principal\n");
        System.out.println("Selecciona opcio: ");

        opcio = scanner.next();

        while(opcio.charAt(0) < 'a' || opcio.charAt(0) > 'f'){
            System.out.println("ERROR: Introdueix una opcio entre a i f gandul\n");
            System.out.println("a) Les meves localitzacions");
            System.out.println("b) Historial de localitzacions");
            System.out.println("c) Les meves rutes");
            System.out.println("d) Parades i estacions preferides");
            System.out.println("e) Estacions inaugurades el meu any de naixement");
            System.out.println("f) Tornar al menú principal\n");
            System.out.println("Selecciona opcio: ");

            opcio = scanner.next();
        }

        return opcio.charAt(0);

    }



}
