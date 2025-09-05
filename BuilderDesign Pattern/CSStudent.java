package BuilderDesignPattern;

import java.util.Arrays;
import java.util.List;

public class CSStudent extends StudentBuilder{

    @Override
    public StudentBuilder setSubject()
    {
        List<String> sub = Arrays.asList("OS","CS");
        this.subject= sub;
        return this;
    }
}
