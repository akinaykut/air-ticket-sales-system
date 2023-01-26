
import java.util.HashMap;

public class Plane {
    // This class represent a plane which one will fly

    private HashMap<String, Chair> chairList;
    // All chairs inside of the plane
    {
        chairList = new HashMap<>();
        chairList.put("A1", new Chair(ChairType.Business, "A1") );
        chairList.put("A2", new Chair(ChairType.Business, "A2") );
        chairList.put("A3", new Chair(ChairType.Business, "A3") );
        chairList.put("A4", new Chair(ChairType.Business, "A4") );
        chairList.put("A5", new Chair(ChairType.Business, "A5") );
        chairList.put("B1", new Chair(ChairType.Economy, "B1") );
        chairList.put("B2", new Chair(ChairType.Economy, "B2") );
        chairList.put("B3", new Chair(ChairType.Economy, "B3") );
        chairList.put("B4", new Chair(ChairType.Economy, "B4") );
        chairList.put("B5", new Chair(ChairType.Economy, "B5") );

    }

    // Getters and Setters methods
    public HashMap<String, Chair> getChairList() {
        return chairList;
    }

    public void setChairList(HashMap<String, Chair> chairList) {
        this.chairList = chairList;
    }




}
