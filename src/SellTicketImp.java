

public class SellTicketImp implements ISellTicketStrategy{
    // This class handle sell process each airline company
    @Override
    public void sellTicket(Voyage voyage, Customer customer, String chairNumber) {
        if(voyage.getPlane().getChairList().get(chairNumber).isAvailable()) {
            voyage.getPlane().getChairList().get(chairNumber).setAvailable(false);
            customer.setChairNumber(chairNumber);
            voyage.addCustomer(customer);
            System.out.println("Sell process is successfully completed.");
        }
    }
}
