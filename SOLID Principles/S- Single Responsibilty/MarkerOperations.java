package SingleResponsibilityPrinciple;


/*
This class MarkerOperations have 3 reasons to get changed

Reason 1> If some logic to calculateMarkerPrice gets change then u have to change calculateMarkerPrice method
Reason 2> If some logic to saveToDB gets change then u have to change saveToDB method
Reason 3> If some logic to printInvoice gets change then u have to printInvoice saveToDB method


Solution - Make 3 different class for 3 different responsibilities

 */
public class MarkerOperations {

    Marker marker;
    int quantity;

    public int calculateMarkerPrice(int quantity)
    {
        return marker.getPrice()*quantity;
    }

    public void saveToDB()
    {
        // saving marker details to DB
    }

    public void printInvoice()
    {
        // printing Calculated price and Invoice details
    }
}
