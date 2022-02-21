public class Event {
	
	public final static int PRICE_PER_GUEST = 35;
	public final static int CUT_OFF = 50;
    
	private String EventNum;
    private int NumOfGuests;
    private int EventPrice;
    
    public Event(){
    	new Event("A000",0);
    }
    public Event(String EventNum, int NumOfGuests){
    	setEventNumber(EventNum);
    	setGuests(NumOfGuests);
    }
    public void setEventNumber(String eventNum) {
        EventNum = eventNum;
    }
    public void setGuests(int noOfGuest) {
        NumOfGuests = noOfGuest;
        EventPrice = NumOfGuests * PRICE_PER_GUEST; 
        }   
    public String getEventNumber() {
        return EventNum;
    }
    public int getNumOfGuests() {
        return NumOfGuests;
    }
    public int getPrice() {
        return EventPrice;
    }
}
