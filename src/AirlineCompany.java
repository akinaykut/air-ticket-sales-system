
import java.util.ArrayList;

// Parent class of airlineCompanies
public class AirlineCompany {

    private AirlineCompanyType airlineCompanyType;

    // Storage all voyage for each airline company
    private ArrayList<Voyage> voyageList;

    // Constructor method
    public AirlineCompany(AirlineCompanyType airlineCompanyType) {
        this.airlineCompanyType = airlineCompanyType;
        this.voyageList = new ArrayList<>();
    }

    public AirlineCompanyType getAirlineCompanyType() {
        return airlineCompanyType;
    }

    public void setAirlineCompanyType(AirlineCompanyType airlineCompanyType) {
        this.airlineCompanyType = airlineCompanyType;
    }

    public ArrayList<Voyage> getVoyageList() {
        return voyageList;
    }

    public void setVoyageList(ArrayList<Voyage> voyageList) {
        this.voyageList = voyageList;
    }


    // It  shows all voyages inside of the airline company
    public void showVoyageList() {
        for(Voyage voyage : voyageList) {
            System.out.println("Airline Company: " + airlineCompanyType);
            System.out.println("-------------------------------");
            System.out.println("Voyage Type: " + voyage.getVoyageType());
            System.out.println("Departure Point: " + voyage.getDeparturePoint() + " | Arrive Point: " + voyage.getArrivePoint());
        }
    }


}
