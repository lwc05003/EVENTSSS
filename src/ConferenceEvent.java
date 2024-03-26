public class ConferenceEvent  {
     private boolean breakfastRequired ;
     private double brefakfastCost ;
     private boolean lunchRequired ;
     private double lunchCost ;
     private boolean dinnerRequired ;
     private double dinnerCost ;
     private double conferenceEventCost ;
     private String eventID;
     private String eventName;
     private String eventLocation;
     private CaculateEventCostClass caculateEventCostObject;
     public int totalParticipants ;
     public int totalEventDays;

     public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact,  int totalParticipants, int totalEventDays , 
     double brefakfastCost, double lunchCost, double dinnerCost ) {
        this.brefakfastCost = brefakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
        this.caculateEventCostObject = new CaculateEventCostClass() ;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        

        }
   

    public double getBreakfastCost() {
        return brefakfastCost;
    }

    public void setBreakfastCost(double brefakfastCost) {
        this.brefakfastCost = brefakfastCost;
    }

    public double getLunchCost() {
        return lunchCost;
    }

    public void setLunchCost(double lunchCost) {
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost() {
        return dinnerCost;
    }

    
    public void calculateEventCost() {
        conferenceEventCost = caculateEventCostObject.calculateEventCost() + ((brefakfastCost + lunchCost + dinnerCost) * totalEventDays * totalParticipants);
        
    }
    
  

    public String getEventID() {
        return eventID;
    }
     
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }

    public int getTotalEventDays() {
        return totalEventDays;
    }

    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
    }
    
    

    
    public String toString() {
        return "Conference Event details :" + "\n" +
               "Event ID: " + eventID + "\n" +
               "Event Name: " + eventName + "\n" +
               "Event Location: " + eventLocation + "\n" +
              "Total Participants: " + totalParticipants + "\n" +
              "Total Conference Cost: " + conferenceEventCost;
                
            }

 }
    