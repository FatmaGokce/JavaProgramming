package day_22_string_manipulation3;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(","));//4
        //last comma
        System.out.println(technologies.lastIndexOf(","));//41
        //for middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");//0
        System.out.println("java is at index " + indexOfJava);

        int indxOfCss = technologies.indexOf("css");//12
        System.out.println("css is at index "+indxOfCss);

        int indxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index "+ indxOfCucumber);

        int indxOfSql = technologies.indexOf("sql");//-1
        System.out.println("index of sql " + indxOfSql);

        //technologies contains maven?
        if(technologies.contains("maven")) {
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("av") >= 0) {
            System.out.println("present");
        }else {
            System.out.println("not present");
        }
    }
}
