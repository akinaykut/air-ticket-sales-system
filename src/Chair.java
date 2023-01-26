

public class Chair {
    // Represent each chair from plane


    private ChairType chairType;
    private String chairNumber;
    private boolean available;
    private double price;


    // Constructor method
    public Chair(ChairType chairType, String chairNumber) {
        this.chairType = chairType;
        this.chairNumber = chairNumber;
        available = true;
    }

    // Getter and Setter methods
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ChairType getChairType() {
        return chairType;
    }

    public void setChairType(ChairType chairType) {
        this.chairType = chairType;
    }

    public String getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(String chairNumber) {
        this.chairNumber = chairNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
