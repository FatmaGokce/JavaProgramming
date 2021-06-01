package day_32_array_split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("-----Starting deployment of etsy app to AWS zones...");
        String[] zonesToDeploy = zones.split("");
        System.out.println(Arrays.toString(zonesToDeploy));
        for(String each : zonesToDeploy){
            System.out.println("Deploying [" + app + "] to " + each + "...");
        }
        System.out.println("-----All deployment complete-----");
    }
}
