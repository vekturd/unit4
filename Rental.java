public class Rental {

	public static final int MINUTES_IN_AN_HOUR = 60;	// final int val for minutes in one hour
	public static final int HOURLY_RENTAL_RATE = 40;	// final int cal for hourly rental rate

	private String ContractNumber;						//	private string field to hold a contract number
	private int RentalHours;							//	private int field to hold rental hours
	private int ExtraMinutesOverHour;					//  private int field to hold number of min over an hour
	private int Price;									//  private int field to hold price

	public Rental() {
		new Rental("A000",0);
	}
	public Rental(String contractNum, int numOfMin){
    	setContractNumber(contractNum);
    	setHoursAndMinutes(numOfMin);
    }
	public void setContractNumber(String contractNumber){	// Set method for assigning contract number 
		ContractNumber = contractNumber;
	}
	public void setHoursAndMinutes(int minutes){		// Set method for calculating total price using if... else statement.
		if (minutes >= MINUTES_IN_AN_HOUR){
			RentalHours = minutes/MINUTES_IN_AN_HOUR;
			ExtraMinutesOverHour = minutes % MINUTES_IN_AN_HOUR;
			Price = (RentalHours * HOURLY_RENTAL_RATE) + (ExtraMinutesOverHour);
		} else {
			Price = 40;
		}
	}
	
	public String getContractNumber() {					// Returns contract number 
		return ContractNumber;
	}

	public int getRentalHours(){						//	Returns rental hours
		return RentalHours;
	}

	public int getExtraMinutesOverAnHour(){				// returns additional minutes over an hour
		return ExtraMinutesOverHour;
	}

	public int getPrice(){								// returns price 
		return Price;
	}
}


