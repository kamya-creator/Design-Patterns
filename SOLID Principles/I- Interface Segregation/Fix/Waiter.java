package InterfaceSegregation.Fix;

public class Waiter implements ServeFood{
    @Override
    public void serveFood() {
        System.out.println("Serving Food");
    }
}
