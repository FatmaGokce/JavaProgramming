package day_46_encapsulation;

public class DealerShip {
    public static void main(String[] args) {

        Car car1 = new Car();
        //car1.model = "Nissan Altime";//we cannot assign like that because it is private
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = "+car1.getModel());
        car1.setYear(2020);
        System.out.println("car1.getYear() = " + car1.getYear());
        car1.setMileage(20_000);
        System.out.println("car1.getMileage() = " + car1.getMileage());
        System.out.println(car1.toString());
        System.out.println(car1);



    }
}
