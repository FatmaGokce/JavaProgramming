package day_20_string_manipulation;

import day_05_primitives_concatanation.JobInfo;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        }else {
            System.out.println("JobTitle looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("JobTitle is empty");
        }else {
            System.out.println("Job title is not empty");
        }

        if (" ".equals(jobTitle)) {
            System.out.println("Job Title is empty");
        }else {
            System.out.println("Job Title is not empty");
        }

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());

        String result = (!veggie.isEmpty()) ? ("We have carrots ") : ("We don't have any vegetables");
        System.out.println(result);
    }
}
