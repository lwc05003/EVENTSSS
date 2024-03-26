public class PastEvents  {

    public static final double pastEventCost = 1000.00;
    
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    public int totalParticipants ;
    public int totalEventDays;
    public static final double tax = 0.30;
    public String eventID;
    public String eventName;
    public String eventLocation;
    public String pointOfContact;
    public double eventCost;

    
    public PastEvents(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
        this.totalParticipants = totalParticipants;
     
}

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }

    public boolean getRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }
    
    public void calculateCost() {
        double cost =1000 + (1000*tax);

    }

    public void setPaymentDetails(String paymentAtatus,boolean requiresExtension) {
        this.paymentDetails = "The event cost was" + pastEventCost + "and the payment status is" + paymentAtatus + "\n" + "The Customer requires extension:" + requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }
    
    public String toString() {
        return "\n" + "Event ID" + eventID+ "\n" + "Point of Contact" + pointOfContact + "\n" + "Total Participants" + totalParticipants + "\n" + "Total Event Days" + totalEventDays + "\n" + "The past event details:" + "\n" + "The payment details are follows:" + "\n" +paymentDetails;
     }
}