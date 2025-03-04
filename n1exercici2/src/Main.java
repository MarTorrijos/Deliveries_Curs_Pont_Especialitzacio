public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Prius");

        // Despite what we were told in Fonaments de la programacio, it's unnecessary to specify car1.toString()
        // println will automatically call the toString method on the object
        System.out.println(car1);
        System.out.println(Car.brake());        // invocation of the static method
        System.out.println(car1.accelerate());  // invocation of the non-static method
    }

}