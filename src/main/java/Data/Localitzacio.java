package Data;

public class Localitzacio {
    String name;
    float coordinates[];
    String description;

    public Localitzacio(String name, float coordinates[], String description){
        this.name = name;
        this.coordinates = new float[2];
        this.coordinates = coordinates;
        this.description = description;
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

    public void setCoordinates(float[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
