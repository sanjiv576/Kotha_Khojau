package model;

public class Driver_Details {

    private int DriverID;
    private String FullName;
    private String Contact;
    private String AvailableLocation;
    private String ServiceChargeStatus;
    private String ShortDistance;
    private String LongDistance;
    private String VehicleSize;

    public Driver_Details(int DriverID, String FullName, String Contact, String AvailableLocation, String ServiceChargeStatus,
                          String ShortDistance, String LongDistance, String VehicleSize){


        this.DriverID = DriverID;
        this.FullName = FullName;
        this.Contact = Contact;
        this.AvailableLocation = AvailableLocation;
        this.ServiceChargeStatus = ServiceChargeStatus;
        this.ShortDistance = ShortDistance;
        this.LongDistance = LongDistance;
        this.VehicleSize = VehicleSize;
    }

    public Driver_Details(String FullName, String Contact, String AvailableLocation, String ServiceChargeStatus,
                          String ShortDistance, String LongDistance, String VehicleSize){

        this.FullName = FullName;
        this.Contact = Contact;
        this.AvailableLocation = AvailableLocation;
        this.ServiceChargeStatus = ServiceChargeStatus;
        this.ShortDistance = ShortDistance;
        this.LongDistance = LongDistance;
        this.VehicleSize = VehicleSize;
    }

    public Driver_Details(){

    }

    // accessor/getter method
    public int getDriverID(){
        return DriverID;
    }

    // mutator/setter method
    public void setDriverID(int DriverID){
        this.DriverID = DriverID;
    }

    public String getFullName(){
        return FullName;
    }

    public void setFullName(String FullName){
        this.FullName = FullName;
    }

    public String getContact(){
        return Contact;
    }

    public void setContact(String Contact){
        this.Contact = Contact;
    }

    public String getAvailableLocation(){
        return AvailableLocation;
    }

    public void setAvailableLocation(String AvailableLocation){
        this.AvailableLocation = AvailableLocation;
    }

    public String getServiceChargeStatus(){
        return ServiceChargeStatus;
    }

    public void setServiceChargeStatus(String ServiceChargeStatus){
        this.ServiceChargeStatus = ServiceChargeStatus;
    }

    public String getShortDistance(){
        return ShortDistance;
    }

    public void setShortDistance(String ShortDistance){
        this.ShortDistance = ShortDistance;
    }

    public String getLongDistance(){
        return LongDistance;
    }

    public void setLongDistance(String LongDistance){
        this.LongDistance = LongDistance;
    }

    public String getVehicleSize(){
        return VehicleSize;
    }

    public void setVehicleSize(String VehicleSize){
        this.VehicleSize = VehicleSize;
    }

}
