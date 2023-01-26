

public class Main {

   public static void main(String[] args) {



       PegasusAirlines pegasusAirlines = new PegasusAirlines(AirlineCompanyType.PegasusAirlines);
       TurkishAirlines turkishAirlines = new TurkishAirlines(AirlineCompanyType.TurkishAirlines);

       Voyage voyage1 = new Voyage(VoyageType.Domestic, "Ankara", "Istanbul");
       Voyage voyage2 = new Voyage(VoyageType.Abroad, "Istanbul", "Paris");

       Voyage voyage3 = new Voyage(VoyageType.Domestic, "Adana", "Izmir");
       Voyage voyage4 = new Voyage(VoyageType.Abroad, "Istanbul", "London");

       turkishAirlines.getVoyageList().add(voyage1);
       turkishAirlines.getVoyageList().add(voyage2);
       pegasusAirlines.getVoyageList().add(voyage3);
       pegasusAirlines.getVoyageList().add(voyage4);

       TurkishAirlinesCalculateTicketPriceServicesImp ticketPrice1 = new TurkishAirlinesCalculateTicketPriceServicesImp();
       PegasusAirlinesCalculateTicketPriceServicesImp ticketPrice2 = new PegasusAirlinesCalculateTicketPriceServicesImp();

       ticketPrice1.turkishAirlinesCalculateTicketPrice(turkishAirlines, voyage1);
       ticketPrice1.turkishAirlinesCalculateTicketPrice(turkishAirlines, voyage2);
       ticketPrice2.pegasusAirlinesCalculateTicketPrice(pegasusAirlines, voyage3);
       ticketPrice2.pegasusAirlinesCalculateTicketPrice(pegasusAirlines, voyage4);

        Customer customer1 = new Customer("Akin", "Aykut");
        Customer customer2 = new Customer("Alperen", "Gül");

       SellTicketImp sellTicketImp = new SellTicketImp();

       sellTicketImp.sellTicket(turkishAirlines.getVoyageList().get(0), customer1, "A2");
       sellTicketImp.sellTicket(turkishAirlines.getVoyageList().get(0), customer2, "A1");

       turkishAirlines.getVoyageList().get(0).showPassengers(AirlineCompanyType.TurkishAirlines);

   }






}
