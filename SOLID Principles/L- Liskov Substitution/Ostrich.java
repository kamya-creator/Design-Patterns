package LiskovSubstitution;

public class Ostrich extends Bird{
    @Override
    public void fly() {

        /*
        Here you are narrowing down the capabilities for Parent Class by throwing exception
        This shows classic violate of LSP(Liskov Substitution Principle)
        LSP ensures subclasses are interchangeable with their parents without unexpected behavior.

        Throwing an exception in a subclass method that normally works in the base class violates LSP.

        Fix such violations by restructuring class hierarchies — introduce more specific abstractions if needed (like FlyingBird).
         */
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
