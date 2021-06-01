package day_48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.driver = new Driver("Fatma");
        bus.engine = new Engine(10);

        System.out.println(bus);

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Aziz");
        metroBus.engine = new Engine(15);

        System.out.println(metroBus);

    }
}
