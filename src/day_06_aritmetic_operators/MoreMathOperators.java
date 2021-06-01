package day_06_aritmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyota = 431;
        int honda = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking =(toyota + honda + vw + tesla + nissan + bmw);

        System.out.println("There are " + totalCarsInParking + " cars in parking lot.");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicePerPerson = slices / people;
        System.out.println("There are " + slicePerPerson + " slices per person.");
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, "
                        + people + " people ate " + slicePerPerson + " slices each.");
    }
}
