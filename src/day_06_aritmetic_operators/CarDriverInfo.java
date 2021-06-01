package day_06_aritmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "BMW X5";
        String driverName = "Fatma";
        String licenseNum = "H12345";
        short speed = 70;
        boolean isAutomatic = true;
        char licenseClass = 'G';

        System.out.println(carModel + " is car model");
        System.out.println(driverName + " is driving a car");
        System.out.println(driverName + " is driving " + carModel);
        System.out.println("Current speed is: " + speed + " mph");
        System.out.println("Is car automatic: " + isAutomatic);
        System.out.println(licenseClass + " is License Class");
        System.out.println(licenseClass + " - " + isAutomatic);//after or before boolean must use "" any string.


    }
}
