package Data;

import java.util.ArrayList;

public class User {
    private String username;
    private String mail;
    private int anyNaixement;

    private ArrayList<Localitzacio> localitzacions;

    public User(){
        localitzacions = new ArrayList<Localitzacio>();
    }

    public User(String username, String mail, int anyNaixement) {
        this.username = username;
        this.mail = mail;
        this.anyNaixement = anyNaixement;
        localitzacions = new ArrayList<Localitzacio>();
    }

    public void printAllMyData(){
        System.out.println("Name: " + this.username);
        System.out.println("Mail: " + this.mail);
        System.out.print("Any Naixement: ");
        System.out.println(this.anyNaixement);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAnyNaixement() {
        return anyNaixement;
    }

    public void setAnyNaixement(int anyNaixament) {
        this.anyNaixement = anyNaixement;
    }

    public ArrayList<Localitzacio> getLocalitzacions() {
        return localitzacions;
    }

    public void setLocalitzacions(ArrayList<Localitzacio> localitzacions) {
        this.localitzacions = localitzacions;
    }
}
