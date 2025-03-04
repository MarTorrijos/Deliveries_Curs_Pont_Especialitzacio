public class Wind extends Instrument {

    // static block
    static {
        System.out.println("The class Wind has been loaded");
    }

    public Wind(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A wind instrument is playing";
    }

}