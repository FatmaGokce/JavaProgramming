package office_hours.Practice_05_18_2021;

public class Earth {
    public static void main(String[] args) {

        AnimalSpecies dogs = new AnimalSpecies();
        dogs.setInfo("Oscar", 45, 10);
        System.out.println(dogs.getName());
        System.out.println(dogs.getPopulation());
        System.out.println(dogs.getGrowthRate());
        System.out.println(dogs);

        AnimalSpecies cats = new AnimalSpecies();
        System.out.println(cats);
        cats.setInfo("Coco", 50, 12);
        System.out.println(cats);

        AnimalSpecies birds = cats;//birds refers to cats values.
        cats.setInfo("birds", 200, 20);
        System.out.println(birds);

    }
}
