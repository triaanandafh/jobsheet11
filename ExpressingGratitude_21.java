import java.util.Scanner;
public class ExpressingGratitude_21 {
    public static String getGreetingRecipient(){
        Scanner input21 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input21.nextLine();
        input21.close();
        return recipientName;
    }

    public static void sayThankyou(){
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+ " for being the best teacher in the world.\n" + "You inspired in me a love learning and made me feel like I could ask you anything.");
    }

    public static void sayAdditionalGreetings(String greetings){
        System.out.println("Additional greetings: " + greetings);
    }
    public static void main(String[] args) {
        sayThankyou();
        sayAdditionalGreetings("Be yourself, be kind, and work hard");
    }
}
