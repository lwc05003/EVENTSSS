public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AlConference", "Paris", "Peng Tian", 50, 2, 25, 40, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent.toString());
        PastEvents pastEvents = new PastEvents("E002", "AlConference", "Paris", "Peng Tian", 50, 2);
        pastEvents.getPaymentDetails();
        System.out.println(pastEvents.toString());
       }
    
}