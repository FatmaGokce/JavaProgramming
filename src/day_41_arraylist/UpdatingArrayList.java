package day_41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");//add in the begining
        myCars.add(1,"lada");
        myCars.add(2,"yugo");

        System.out.println(myCars);
        //or
        System.out.println(myCars.toString());//it is not necessary
        //i wanna store all cars in 1 string
        String allCarsIn1Str = myCars.toString();
        System.out.println("All cars in 1 String = "+allCarsIn1Str);

        myCars.set(0,"lamborghini");//delete jeep put lamborghini
        System.out.println("after set = " + myCars);

        myCars.set(4,"honda");
        System.out.println("after set honda = " + myCars);//delete mazda put honda

        /**
         How would you do that if myCars was array:
         myCars[4] = "honda";
         */

        //we are doing replace
        System.out.println("index of ford = "+ myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvich to jiguli
        myCars.set(moskvichIndex,"jiguli");
        System.out.println("after set to jiguli = "+ myCars);

        //replace for with trabant using single statement:
        //indexOf("ford"), "trabant"
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after replace ford = " + myCars);

        if (myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else {
            System.out.println("lada can not find");
        }
            System.out.println("after set value bugatti "+myCars);

        /**
         lamborghini -> prius
         lada -> lexus
         trabant ->audi
         */
        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("lamborghini")){
                myCars.set(i, "prius");
            }else if (myCars.get(i).equals("lada")){
                myCars.set(i, "lexus");
            }else if(myCars.get(i).equals("trabant")){
                myCars.set(i, "audi");
            }
        }
        System.out.println("After loop = "+ myCars);
    }
}
