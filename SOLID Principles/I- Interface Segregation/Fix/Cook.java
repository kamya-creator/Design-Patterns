package InterfaceSegregation.Fix;

public class Cook implements CookInterface{

    @Override
    public void cookFood() {
        System.out.println("Cooking food");
    }
}
