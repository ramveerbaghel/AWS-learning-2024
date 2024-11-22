package org.learn.pojo;

public class Address {
    private String streetNo;
    private String city;
    private String pincode;
    private String district;
    private String state;

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNo='" + streetNo + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Address(String streetNo, String city, String pincode, String district, String state) {
        this.streetNo = streetNo;
        this.city = city;
        this.pincode = pincode;
        this.district = district;
        this.state = state;
    }
}
