package day_45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {

        //create traffic light objects
        TrafficLight trafficLight = new TrafficLight();

        //trafficLight.color = "red";
        //we will assign and update teh value of color using a method of the class
        trafficLight.changeColor("red");
        //call method access the variable
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();
    }
}