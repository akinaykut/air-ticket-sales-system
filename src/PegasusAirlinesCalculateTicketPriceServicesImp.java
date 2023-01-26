

public class PegasusAirlinesCalculateTicketPriceServicesImp implements IPegasusAirlinesCalculateTicketPriceStrategy {

    // This class handle that it calculate ticket price for Pegasus airline company
    @Override
    public void pegasusAirlinesCalculateTicketPrice(PegasusAirlines pegasusAirlines, Voyage voyage) {
        // Calculate each ticket price to selected voyage

        voyage.getPlane().getChairList().forEach((key, value) -> {
            double price = 150;
            if(ChairType.Business.equals(voyage.getPlane().getChairList().get(key).getChairType())) {
                price *= 1.2;
            }
            if(VoyageType.Abroad.equals(voyage.getVoyageType())){
                price *= 1.4;
            }
            voyage.getPlane().getChairList().get(key).setPrice(price);
        });
    }
}
