public class PastEvents extends Event {

    public static final double pastEventCost = 1000.00;
    
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    
    public PastEvents(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
    
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

    @Override
    public String toString() {
        return "\n" + "Event ID" + getEventID() + "\n" + "Point of Contact" + getPointOfContact() + "\n" + "Total Participants" + getTotalParticipants() + "\n" + "Total Event Days" + getTotalEventDays() + "\n" + "The past event details:" + "\n" + "The payment details are follows:" + "\n" +paymentDetails;
     }
}