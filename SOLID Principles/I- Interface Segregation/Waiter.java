package InterfaceSegregation;



/*
Interface is forcing to implement those methods which are not job of this class
 */

public class Waiter implements Restaurant {
    @Override
    public void serveFood() {
        System.out.println("Serving food");
    }

    @Override
    public void washDish() {
        // Not its job
    }

    @Override
    public void CookFood() {
        // not its job
    }
}
