// Named the class String_instrument because calling it String caused problems, since String is a Java reserved keyword

public class String_instrument extends Instrument {

    // static block
    static {
        System.out.println("The class String_instrument has been loaded");
    }

    public String_instrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A string instrument is playing";
    }

}