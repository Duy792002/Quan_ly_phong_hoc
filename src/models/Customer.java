package models;

public class Customer {
    private long idCustomer;
    private String cccd;
    private String phoneNumber;

    public Customer() {

    }

    public Customer(String cccd, String phoneNumber) {
        this.cccd = cccd;
        this.phoneNumber = phoneNumber;
    }


    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-30s%-18s", getIdCustomer(), getCccd(), getPhoneNumber());
    }

}



