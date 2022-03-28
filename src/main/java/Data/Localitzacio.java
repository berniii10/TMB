package Data;

public class Localitzacio {
    private String name;
    private float coordinates[];
    private String description;

    public Localitzacio(){
        coordinates = new float[2];
    }

    public Localitzacio(String name, float coordinates[], String description){
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;
    }


    public void printAllData(){
        System.out.println("Name: " + this.name);
        System.out.println("Coordinates: [" + this.coordinates[0] + " - " + this.coordinates[1] + "]");
        System.out.println("Description: " + this.description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getCoordinates() {
        return coordinates;
    }

    public float get1stCoordinate(){return coordinates[0]; }
    public float get2stCoordinate(){return coordinates[1]; }

    public void setCoordinates(float[] coordinates) {
        this.coordinates = coordinates;
    }

    public void set1stCoordinate(float f){coordinates[0] = f; }
    public void set2stCoordinate(float f){coordinates[1] = f; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
