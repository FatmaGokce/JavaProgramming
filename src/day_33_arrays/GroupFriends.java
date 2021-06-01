package day_33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        String[] friends = {"Aurora", "Effy", "Eun", "Fatma", "Jimell",
                "Khalid", "Maihemuti", "Muzdalifa", "Omar", "Oscar", "Tatiana"};

        for ( String groupFriends : friends ){
            System.out.println("Happy holidays " + groupFriends + "!");
        }
    }
}
