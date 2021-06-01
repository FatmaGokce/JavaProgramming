package day_16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;

        if(floorNum == 1){ //case 1:
            System.out.println("Floor 1 selected: Companies: Lobby, Verizon, Starbucks");
        }else if (floorNum == 2){ //case 2:
            System.out.println("Floor 2 selected: Companies: CyberTek, NASA, Intelsat");
        }else if (floorNum == 3){ //case 3:
            System.out.println(" Floor 3 selected: Companies: Lyft, BofA, Stake House ");
        }else{ //default:
            System.out.println("Invalid Floor Number");
        }

        System.out.println("================== SWITCH STATEMENT =======================");

        floorNum = 4;

        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected: Companies: Lobby, Verizon, Starbucks");
                break;//exit the switch statement
            case 2:
                System.out.println("Floor 2 selected: Companies: CyberTek, NASA, Intelsat");
                break;
            case 3:
                System.out.println(" Floor 3 selected: Companies: Lyft, BofA, Stake House ");
                break;
            default:
                System.out.println("Invalid Floor Number");
        }
    }
}
