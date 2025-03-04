public class Main {

    public static void main(String[] args) {
        // When we create the first Wind instance the class Wind is loaded, and we get the static message from it
        Wind windInstrument1 = new Wind("Tumpet", 839);
        Wind windInstrument2 = new Wind("Flute", 599);
        System.out.println(windInstrument1.play() + "\n" + windInstrument2.play());

        // Here the same happens when we create an instance of String_instrument
        String_instrument stringInstrument1 = new String_instrument("Violin", 1850);
    }

}