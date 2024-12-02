import java.util.Scanner;
public class Greetings_21 {
    public static String getGreetingRecipient(){
        Scanner input21 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input21.nextLine();
        input21.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+ " May the force be with you!");
    }
}
