

import java.util.ArrayList;

public class Voyage {
    // This class represent each voyage inside of the airline company


    private Plane plane;
    private VoyageType voyageType;
    private String departurePoint;
    private String arrivePoint;
    private ArrayList<Customer> customers;


    // Constructor method
    public Voyage(VoyageType voyageType, String departurePoint, String arrivePoint) {
        this.voyageType = voyageType;
        this.arrivePoint = arrivePoint;
        this.departurePoint = departurePoint;
        this.plane = new Plane();
        this.customers = new ArrayList<>();
    }

    // Getter and Setter methods
    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
    public VoyageType getVoyageType() {
        return voyageType;
    }

    public void setVoyageType(VoyageType voyageType) {
        this.voyageType = voyageType;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getArrivePoint() {
        return arrivePoint;
    }

    public void setArrivePoint(String arrivePoint) {
        this.arrivePoint = arrivePoint;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }


    // It shows all available chairs from plane object
    public void showAvailableChairs(AirlineCompanyType airlineCompanyType) {
        System.out.println(airlineCompanyType);
        System.out.println("Voyage type: " + voyageType);
        plane.getChairList().forEach((key, value) -> {
            System.out.println("----------------------------");
            if(value.isAvailable()) {
                System.out.println("Chair number: " + key);
                System.out.println("Chair type: " + value.getChairType());
                System.out.println("Chair price: " + value.getPrice());
            }

        });
    }

    // It shows all passenger from customerList
    public void showPassengers(AirlineCompanyType airlineCompanyType) {
        System.out.println(airlineCompanyType);
        System.out.println("Voyage type: " + voyageType);

        for(Customer customer : customers) {
            System.out.println("----------------------------------");
            System.out.println("Passenger: " + customer.getName() + " " + customer.getSurname());
            System.out.println("Chair Number: " + customer.getChairNumber());
            System.out.println("Chair Type: " + getPlane().getChairList().get(customer.getChairNumber()).getChairType());
            System.out.println("Ticket Price: " + getPlane().getChairList().get(customer.getChairNumber()).getPrice());
        }
    }

}
