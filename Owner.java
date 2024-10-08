

public class Owner {
    private int id;
    private String name;
    private int coefficient;
    private String idNumber;
    private String apartmentNumber;
    private String phoneNumber;

    
    public Owner(int id, String name, int coefficient, String idNumber, String apartmentNumber, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.coefficient = coefficient;
        this.idNumber = idNumber;
        this.apartmentNumber = apartmentNumber;
        this.phoneNumber = phoneNumber;
    }

    
    public void registerOwner(String name, int coefficient, String idNumber, String apartmentNumber, String phoneNumber) {
        
    }

    public void updateOwner(int id, String name, int coefficient, String idNumber, String apartmentNumber, String phoneNumber) {
        
    }

    public void deleteOwner(int id) {
        
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCoefficient() { return coefficient; }
    public void setCoefficient(int coefficient) { this.coefficient = coefficient; }
    public String getIdNumber() { return idNumber; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }
    public String getApartmentNumber() { return apartmentNumber; }
    public void setApartmentNumber(String apartmentNumber) { this.apartmentNumber = apartmentNumber; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
