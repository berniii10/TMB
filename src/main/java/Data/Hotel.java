package Data;

public class Hotel extends Localitzacio{
    int stars;

    public Hotel(String name, float coordinates[], String description, int stars) {
        super(name, coordinates, description);
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
