import java.util.Scanner;

public class EventDemo {
	public static void main(String[] a1rgs) {
		Scanner in =new Scanner(System.in);
		System.out.println("*************************************************");
		System.out.println("* Carly's makes the food that makes it a party. *");
		System.out.println("*************************************************");
		Event EventOne = new Event();
    
		System.out.println("Enter New Event Number: ");
		String eventNum2 = in.next();
		System.out.println("Enter Number of guests: ");
		int numOfGuests2 = in.nextInt();
		
		Event EventTwo = new Event(eventNum2, numOfGuests2);
     
		System.out.println("Event Number: " + EventOne.getEventNumber() + "\n Total Guests: "
				+ EventOne.getNumOfGuests() + "\n Total Price of Event: $" + EventOne.getPrice());
		
		System.out.println("Event Number: " + EventTwo.getEventNumber() + "\n Total Guests: "
				+ EventTwo.getNumOfGuests() + "\n Total Price of Event: $" + EventTwo.getPrice());
     
    }
   
}

