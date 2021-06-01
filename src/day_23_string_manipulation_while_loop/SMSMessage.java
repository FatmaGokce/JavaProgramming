package day_23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Nadir ] From Number:<222-333-4444> " +
                "Message:{Hello, lets code some java}";

        int start = message.indexOf("<");
        int end = message.indexOf(">");
        int start1 = message.indexOf("[");
        int end1 = message.indexOf("]");
        int start2 = message.indexOf("{");
        int end2 = message.indexOf("}");
        String sender = message.substring(start1+1,end1);
        System.out.println("Sender: " + sender);
        String phoneNumber = message.substring(start+1,end);
        System.out.println("Phone Number: " + phoneNumber);
        String messageBody = message.substring(start2+1,end2);
        System.out.println("Message body: " + messageBody);
        //second way
        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println(mobile);

        sender = sender.trim();//trim remove the space..
        if (sender.equals("Nadir")) {//because it has space..
            System.out.println("Message from Nadir about quiz");
        }else {
            System.out.println("message is not from Nadir");
        }


    }
}
