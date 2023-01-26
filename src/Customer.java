
public class Customer {

    // This class represent a passenger
    private String name;
    private String surname;
    private String chairNumber;


    // Constructor method
    public Customer(String name, String surname) {
        this.surname = surname;
        this.name = name;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(String chairNumber) {
        this.chairNumber = chairNumber;
    }
}
