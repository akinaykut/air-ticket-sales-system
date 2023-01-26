

public class TurkishAirlinesCalculateTicketPriceServicesImp implements ITurkishAirlinesCalculateTicketPriceStrategy {
    // This class handle that it calculate ticket price for Turkish airline company

    @Override
    public void turkishAirlinesCalculateTicketPrice(TurkishAirlines turkishAirlines, Voyage voyage) {

        voyage.getPlane().getChairList().forEach((key, value) -> {

            double price = 200;
            if(ChairType.Business.equals(voyage.getPlane().getChairList().get(key).getChairType())) {
                price *= 1.3;
            }
            if(VoyageType.Abroad.equals(voyage.getVoyageType())){
                price *= 1.5;
            }
            voyage.getPlane().getChairList().get(key).setPrice(price);

        });

    };
}
