package Task1;

public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Magnus", 21);
        Car car1 = new Car(true, "Ferrari", 2016, "La Ferrari", null);
        Car car2 = new Car(true, "Ferrari", 2017, "California", null);
        car1.setDriver(driver1);
        car2.setDriver(driver1);

        System.out.println(car1.toString() + driver1.toString());
        System.out.println(car2.toString() + driver1.toString());
    }
}