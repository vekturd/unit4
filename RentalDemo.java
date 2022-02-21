import java.util.Scanner;

public class RentalDemo {
	public static void main (String[]args){	// Displays company motto 
		Scanner in = new Scanner(System.in);
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sammy's makes it fun in the sun. S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");	
		Rental rental1 = new Rental();
		
		System.out.println("Enter New Contract Number: ");
		String contractNum2 = in.next();
		System.out.println("Enter Rental Time in Minutes: ");
		int numOfGuests2 = in.nextInt();
		
		Rental rental2 = new Rental(contractNum2, numOfGuests2);
		
		System.out.println("Contract number: " + rental1.getContractNumber() + "\n Total Time: "
				+ rental1.getRentalHours() + "\n Hour(s) " + rental1.getExtraMinutesOverAnHour() + " Minutes" 
				+ "\n Total Price is: " + rental1.getPrice() + "$");
		
		System.out.println("Contract number: " + rental2.getContractNumber() + "\n Total Time: "
				+ rental2.getRentalHours() + "\n Hour(s) " + rental2.getExtraMinutesOverAnHour() + " Minutes" 
				+ "\n Total Price is: " + rental2.getPrice() + "$");
		
	}
}