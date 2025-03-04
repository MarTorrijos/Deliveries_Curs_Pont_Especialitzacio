public class Percussion extends Instrument {

    // static block
    static {
        System.out.println("The class Percussion has been loaded");
    }

    public Percussion(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A percussion instrument is playing";
    }

}