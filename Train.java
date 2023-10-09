import java.util.Date;
class Train {
    private String trainID;
    private String destination;
    private Date scheduledArrival;
    private Date currentLocation;  
    public Train(String trainID, String destination, Date scheduledArrival) {
        this.trainID = trainID;
        this.destination = destination;
        this.scheduledArrival = scheduledArrival;
        this.currentLocation = new Date(); 
    }  
    public String getTrainID() {
        return trainID;
    }
    public String getDestination() {
        return destination;
    }  
    public Date getScheduledArrival() {
        return scheduledArrival;
    } 
    public Date getCurrentLocation() {
        return currentLocation;
    }  
    public void setCurrentLocation(Date currentLocation) {
        this.currentLocation = currentLocation;
    }    
    public Date calculateEstimatedArrival() {
        long estimatedMillis = currentLocation.getTime() + 3600000; 
        return new Date(estimatedMillis);
    }   
    public static void main(String[] args) {
        Train train = new Train("12345", "Station A", new Date()); 
        Date newLocation = new Date(train.getCurrentLocation().getTime() + 600000); 
        train.setCurrentLocation(newLocation);       
        Date estimatedArrival = train.calculateEstimatedArrival();
        System.out.println("Train " + train.getTrainID() + " to " + train.getDestination());
        System.out.println("Scheduled Arrival: " + train.getScheduledArrival());
        System.out.println("Estimated Arrival: " + estimatedArrival);
    }
}