package SingleResponsibilityPrinciple;

public class CalculateMarkerPrice {

    Marker marker = new Marker();
    public int calculateMarkerPrice(int quantity)
    {
        return marker.getPrice()*quantity;
    }

}
