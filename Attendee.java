

public class Attendee {
    private int id;
    private int ownerId;
    private int assemblyId;
    private String phoneNumber;
    private boolean isRegistered;

    
    public Attendee(int id, int ownerId, int assemblyId, String phoneNumber, boolean isRegistered) {
        this.id = id;
        this.ownerId = ownerId;
        this.assemblyId = assemblyId;
        this.phoneNumber = phoneNumber;
        this.isRegistered = isRegistered;
    }

    
    public void registerAttendee(int ownerId, int assemblyId, String phoneNumber) {
        
    }

    public void deregisterAttendee(int id) {
        
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }
    public int getAssemblyId() { return assemblyId; }
    public void setAssemblyId(int assemblyId) { this.assemblyId = assemblyId; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public boolean isRegistered() { return isRegistered; }
    public void setRegistered(boolean registered) { isRegistered = registered; }
}
