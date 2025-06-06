package InterfaceSegregation;


/*
Interface is forcing to implement those methods which are not job of this class
 */
public class Chef implements Restaurant {
    @Override
    public void serveFood() {
        // not it's job
    }

    @Override
    public void washDish() {
        // not it's job
    }

    @Override
    public void CookFood() {
        System.out.println("Cooks food");
    }
}
